package io.github.andichrist.objectRelationalMapping.cqrs;

/*
 Das Muster "Command-Query Responsibility Segregation" (CQRS) ist ein Architekturmuster, das darauf
 abzielt, die Verantwortlichkeiten für das Lesen und Schreiben von Daten in einer Anwendung zu
 trennen. Es schlägt vor, dass die Befehlsvorgänge (Schreibvorgänge) und die Abfragevorgänge
 (Lesevorgänge) unterschiedliche Modelle und Infrastruktur verwenden sollten, um die Skalierbarkeit,
 Leistung und Wartbarkeit der Anwendung zu verbessern.

 CQRS unterscheidet sich von traditionellen architektonischen Ansätzen, bei denen ein einzelnes
 Datenmodell für sowohl Lese- als auch Schreibvorgänge verwendet wird. Stattdessen empfiehlt CQRS die
 Aufteilung in zwei getrennte Modelle:

 1. Befehlsmodell (Command Model): Dieses Modell handhabt die Schreibvorgänge. Es kümmert sich um die
    Aktualisierung des Zustands der Anwendung. In diesem Modell können Geschäftsregeln, Validierungen
    und die Interaktion mit der Datenbank erfolgen.

 2. Abfrage-Modell (Query Model): Dieses Modell ist für die Lesevorgänge verantwortlich. Es bietet
    optimierte Datenstrukturen und Abfragen, um Leseanfragen effizient zu bedienen. Oft wird hierbei
    den Anforderungen von Abfragen und Berichten priorisiert.

 CQRS kann die Performance verbessern, da Schreib- und Lesevorgänge getrennt skaliert und optimiert
 werden können. Es ermöglicht auch eine bessere Anpassung an unterschiedliche Anforderungen von
 Befehlen und Abfragen. Allerdings führt CQRS auch zu einer erhöhten Komplexität und erfordert ein
 sorgfältiges Design, um sicherzustellen, dass die Datenkonsistenz gewahrt bleibt.

 Bitte beachten Sie, dass CQRS oft in Kombination mit anderen Mustern und Techniken wie Event
 Sourcing, Domain-Driven Design (DDD) und speziellen Datenbanken (z. B. NoSQL-Datenbanken für
 Lesevorgänge) verwendet wird. Die genaue Implementierung hängt von den Anforderungen Ihrer
 Anwendung ab.
 */
public class CQRSExample {
  public static void main(String[] args) {
    CommandModel commandModel = new CommandModel();
    QueryModel queryModel = new QueryModel();

    commandModel.createOrder("...");
    String orderDetails = queryModel.getOrderDetails(123);

    System.out.println(orderDetails);
  }
}
