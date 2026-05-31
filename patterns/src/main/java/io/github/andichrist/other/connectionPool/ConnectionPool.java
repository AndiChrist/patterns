package io.github.andichrist.other.connectionPool;

import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.util.LinkedList;
import java.util.Queue;

/*
 Das "Connection Pool" Muster ist ein bekanntes Entwurfsmuster im Bereich der
 Softwareentwicklung, insbesondere in Anwendungen, die auf Datenbanken oder andere externe
 Ressourcen zugreifen. Ein "Connection Pool" ermöglicht die effiziente Verwaltung und
 Wiederverwendung von Verbindungen zu Datenbanken oder anderen externen Diensten, um die
 Leistung und Skalierbarkeit einer Anwendung zu verbessern.

 Das Grundkonzept hinter dem "Connection Pool" Muster besteht darin, dass anstatt bei Bedarf
 immer wieder neue Verbindungen zu öffnen und zu schließen, eine begrenzte Anzahl von
 Verbindungen im Pool gehalten werden. Diese Verbindungen werden im Voraus geöffnet und
 verwaltet, sodass sie bei Bedarf wiederverwendet werden können, anstatt jedes Mal neu
 erstellt zu werden. Dies spart Zeit und Ressourcen, die für das Öffnen und Schließen von
 Verbindungen aufgewendet würden.

 Hier ist eine grobe Skizze, wie das "Connection Pool" Muster funktionieren könnte.

 In diesem Beispiel repräsentiert ConnectionPool einen einfachen Connection Pool.
 getConnection gibt eine verfügbare Verbindung aus dem Pool zurück, falls eine vorhanden
 ist, oder erstellt eine neue Verbindung, wenn der Pool leer ist. releaseConnection gibt
 eine Verbindung zurück in den Pool, sodass sie wiederverwendet werden kann.

 Der tatsächliche Code für einen "Connection Pool" kann komplexer sein und muss Faktoren
 wie Mehrfachgewinnung von Threads, Verbindungsfehlerbehandlung, Timeout-Verhalten usw.
 berücksichtigen. Das Muster ist jedoch nützlich, um die Leistung und Skalierbarkeit von
 Anwendungen zu verbessern, die externe Ressourcen verwenden.

 Viele Programmiersprachen und Frameworks bieten bereits Bibliotheken oder Implementierungen
 für "Connection Pools" an, sodass Sie nicht unbedingt von Grund auf einen eigenen erstellen
 müssen.
 */
public class ConnectionPool {
  private final Queue<Connection> availableConnections = new LinkedList<>();
  private final int maxConnections;

  public ConnectionPool(int maxConnections) {
    this.maxConnections = maxConnections;
    // maxConnections Verbindungen im Voraus öffnen und in den Pool legen
    for (int i = 1; i <= maxConnections; i++) {
      availableConnections.offer(createConnection(i));
    }
  }

  public synchronized Connection getConnection() {
    if (availableConnections.isEmpty()) {
      throw new IllegalStateException("Keine freie Verbindung im Pool verfügbar");
    }
    return availableConnections.poll();
  }

  public synchronized void releaseConnection(Connection connection) {
    if (availableConnections.size() < maxConnections) {
      availableConnections.offer(connection);
    }
    // sonst: Pool ist bereits voll -> Verbindung würde hier geschlossen/verworfen
  }

  public synchronized int availableConnections() {
    return availableConnections.size();
  }

  // Erzeugt eine Dummy-Verbindung über einen dynamischen Proxy (java.sql.Connection ist ein
  // Interface), damit das Beispiel ohne echte Datenbank lauffähig ist.
  private static Connection createConnection(int id) {
    return (Connection) Proxy.newProxyInstance(
        Connection.class.getClassLoader(),
        new Class<?>[]{Connection.class},
        (proxy, method, args) -> switch (method.getName()) {
          case "toString" -> "DummyConnection#" + id;
          case "hashCode" -> System.identityHashCode(proxy);
          case "equals" -> proxy == args[0];
          case "isClosed" -> false;
          default -> null;
        });
  }
}
