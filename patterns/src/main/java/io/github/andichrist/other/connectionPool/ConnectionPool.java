package io.github.andichrist.other.connectionPool;

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
  private Queue<Connection> availableConnections;
  private int maxConnections;

  public ConnectionPool(int maxConnections) {
    this.maxConnections = maxConnections;
    availableConnections = new LinkedList<>();
    // Hier initialisiert man maxConnections Verbindungen und fügt sie zur Warteschlange hinzu
  }

  public synchronized Connection getConnection() {
    if (availableConnections.isEmpty()) {
      // Hier könnten neue Verbindungen erstellt werden, falls der Pool leer ist
    }
    return availableConnections.poll();
  }

  public synchronized void releaseConnection(Connection connection) {
    if (availableConnections.size() < maxConnections) {
      availableConnections.offer(connection);
    } else {
      // Hier könnte die Verbindung geschlossen werden, da der Pool bereits voll ist
    }
  }
}
