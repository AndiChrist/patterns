package io.github.andichrist.structural.proxy;

/*
 Das "Stellvertreter"-Muster (Proxy Pattern) ist ein Entwurfsmuster in der
 objektorientierten Programmierung und gehört zur Kategorie der Strukturmuster (Structural
 Pattern). Das Muster ermöglicht die Kontrolle des Zugriffs auf ein Objekt, indem es ein
 "Stellvertreter"-Objekt zwischen dem Client und dem eigentlichen Objekt platziert. Der
 Client interagiert dann mit dem "Stellvertreter", anstatt direkt auf das eigentliche
 Objekt zuzugreifen.

 Das "Stellvertreter"-Muster kann aus verschiedenen Gründen verwendet werden, z. B. um die
 Leistung zu verbessern, indem aufwändige Operationen nur bei Bedarf ausgeführt werden,
 den Zugriff auf ein entferntes Objekt zu ermöglichen oder den Zugriff auf ein Objekt aus
 Sicherheitsgründen einzuschränken.

 Es gibt verschiedene Arten von "Stellvertreter"-Objekten:

 1. Virtuelles Proxy: Erzeugt das eigentliche Objekt erst, wenn es tatsächlich benötigt
    wird (z. B. Lazy Loading).

 2. Fernproxy (Remote Proxy): Dient als lokaler Vertreter für ein entferntes Objekt, das
    sich in einem anderen Speicherort oder einer anderen Adresse befindet.

 3. Schutzproxy (Protection Proxy): Kontrolliert den Zugriff auf das eigentliche Objekt und
    kann Berechtigungsprüfungen durchführen, bevor eine Operation ausgeführt wird.

 Hier ist eine vereinfachte Implementierung des "Stellvertreter"-Musters in Java mit einem
 virtuellen Proxy.

 Angenommen, wir haben eine teure Ressource, die wir erst dann erstellen möchten, wenn sie
 tatsächlich benötigt wird.

 Im Beispiel haben wir ein Interface Resource, das sowohl von dem eigentlichen Objekt
 RealResource als auch vom "Stellvertreter"-Objekt ProxyResource implementiert wird. Das
 "Stellvertreter"-Objekt kontrolliert den Zugriff auf das eigentliche Objekt, indem es es
 nur bei Bedarf erstellt (Lazy Loading).

 Das "Stellvertreter"-Muster ermöglicht die effiziente Nutzung von Ressourcen, indem teure
 Operationen oder die Erstellung von Objekten auf einen späteren Zeitpunkt verschoben
 werden, wenn sie tatsächlich benötigt werden. Es kann auch verwendet werden, um den
 Zugriff auf Objekte zu kontrollieren und zusätzliche Funktionen wie Berechtigungsprüfungen
 hinzuzufügen.
 */
public class Main {
  public static void main(String[] args) {
    Resource resource = new ProxyResource();

    // Das eigentliche Objekt wird erstellt, wenn die Operation ausgeführt wird
    resource.operation();
    // Ausgabe:
    // Real Resource is being created...
    // Real Resource operation

    // Das eigentliche Objekt wird nicht erneut erstellt, da es bereits erstellt wurde
    resource.operation();
    // Ausgabe:
    // Real Resource operation
  }
}
