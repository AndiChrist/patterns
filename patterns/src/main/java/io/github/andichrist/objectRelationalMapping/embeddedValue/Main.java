package io.github.andichrist.objectRelationalMapping.embeddedValue;

/*
 Das "Embedded Value" Muster ist ein Entwurfsmuster im Bereich der Softwareentwicklung,
 das sich auf die Darstellung von komplexen oder zusammengesetzten Werten in einer
 Datenbank oder anderen persistenten Speichermechanismen bezieht. Es wird oft in
 Verbindung mit dem "Domain-Driven Design" und ORM-Frameworks (Object-Relational
 Mapping) wie Hibernate oder JPA (Java Persistence API) verwendet.

 Das "Embedded Value" Muster ermöglicht es, einfache Wertobjekte, die nicht über eine
 eigene Identität verfügen und eng mit einer übergeordneten Entität verknüpft sind,
 direkt in die Tabelle oder Dokumentstruktur der übergeordneten Entität einzubetten,
 anstatt separate Tabellen oder Dokumente für diese Werte zu erstellen.

 In diesem Beispiel verwenden wir das "Embedded Value" Muster, um eine Adresse als
 eingebettetes Wertobjekt in der Kunde-Entity zu repräsentieren. Anstatt eine separate
 Tabelle für Adressen zu erstellen, wird die Adresse direkt in die Tabelle der Kunden
 eingebettet.
 */
public class Main {
  public static void main(String[] args) {
    Adresse adresse = new Adresse("Beispielstraße", "Beispielstadt", "12345");
    Kunde kunde = new Kunde();
    kunde.setName("Max Mustermann");
    kunde.setAdresse(adresse);

    // Hier würde normalerweise die Persistenzlogik kommen, um den Kunden in der Datenbank zu speichern

    System.out.println("Kunde: " + kunde.getName());
    System.out.println("Adresse: " + kunde.getAdresse().getStraße() + ", " + kunde.getAdresse().getStadt() + ", " + kunde.getAdresse().getPostleitzahl());
  }
}
