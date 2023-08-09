package io.github.andichrist.objectRelationalMapping.activeRecord;

/*
 Das Active Record-Muster ist ein Entwurfsmuster aus der Softwareentwicklung, das
 hauptsächlich im Bereich der Datenbankinteraktion verwendet wird. Es kombiniert
 Datenbankzugriffslogik (CRUD-Operationen: Erstellen, Lesen, Aktualisieren, Löschen) mit
 der Geschäftslogik einer Klasse, die die Daten repräsentiert.

 In einem Active Record-Modell ist jede Datenbanktabelle durch eine eigene Klasse
 repräsentiert. Diese Klasse enthält nicht nur die Eigenschaften (Spalten) der Tabelle,
 sondern auch Methoden, um auf die Datenbank zuzugreifen und CRUD-Operationen auszuführen.
 Dadurch werden Daten und ihre Zugriffslogik in einer einzigen Einheit gekapselt.

 Das Active Record-Muster kann die Entwicklung beschleunigen, indem es den Zugriff auf die
 Datenbank vereinfacht und die Wartung erleichtert, da die Datenbankinteraktion in der
 Klasse selbst enthalten ist. Es kann jedoch auch zu Herausforderungen führen, insbesondere
 wenn die Geschäftslogik komplex ist oder wenn Anforderungen an Trennung von Bedenken
 (Separation of Concerns) und Testbarkeit bestehen.

 Es ist wichtig zu beachten, dass es in modernen Softwareentwicklungsumgebungen auch andere
 Ansätze für die Datenbankinteraktion gibt, wie beispielsweise das Repository-Muster oder
 den Einsatz von ORM (Object-Relational Mapping) Frameworks wie Hibernate oder JPA. Jeder
 Ansatz hat seine Vor- und Nachteile, abhängig von den Anforderungen des Projekts.
 */
public class User {
  private int id;
  private String username;
  private String email;

  // Konstruktoren, Getter und Setter

  public static User findById(int id) {
    // Logik, um einen Benutzer anhand der ID aus der Datenbank abzurufen
    return new User(); // Achtung: hier den richtigen User aus der DB zurückgeben!
  }

  public void save() {
    // Logik, um den Benutzer in die Datenbank zu speichern oder zu aktualisieren
  }

  public void delete() {
    // Logik, um den Benutzer aus der Datenbank zu löschen
  }
}
