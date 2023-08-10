package io.github.andichrist.objectRelationalMapping.inheritanceMapper;

import jakarta.persistence.*;

/*
 Das "Inheritance Mapper" Muster ist ein Entwurfsmuster im Bereich des Object-Relational
 Mapping (ORM) und beschäftigt sich mit der Abbildung von Klassenhirarchien auf eine
 relationale Datenbankstruktur. Es handelt sich um eine Methode, um
 Vererbungsbeziehungen zwischen Klassen in einem objektorientierten System auf
 Tabellenstrukturen in einer relationalen Datenbank abzubilden.

 Das "Inheritance Mapper" Muster ist besonders relevant, wenn eine objektorientierte
 Anwendung Klassen hat, die voneinander erben (z.B. eine Klasse "Fahrzeug" mit
 Unterklassen "Auto", "Fahrrad" usw.), und diese Vererbungsbeziehungen in der Datenbank
 konsistent und effizient gespeichert werden sollen.

 Es gibt verschiedene Ansätze, wie "Inheritance Mapper" umgesetzt werden kann:

 1. Single Table Inheritance: Alle Klassen in der Vererbungshierarchie werden in einer
    einzigen Datenbanktabelle gespeichert. Es werden Spalten für die spezifischen
    Eigenschaften der einzelnen Klassen hinzugefügt, und eine Spalte wird verwendet,
    um den Typ des Objekts zu unterscheiden.

 2. Class Table Inheritance: Jede Klasse in der Vererbungshierarchie hat ihre eigene
    Tabelle, in der sowohl die gemeinsamen als auch die spezifischen Eigenschaften
    gespeichert werden. Eine Verbindung zwischen den Tabellen wird durch Fremdschlüssel
    hergestellt.

 3. Concrete Table Inheritance: Jede Klasse hat eine eigene Tabelle, in der sowohl die
    gemeinsamen als auch die spezifischen Eigenschaften gespeichert werden. Keine
    spezielle Verbindung zwischen den Tabellen wird erstellt.

 Die Wahl des Ansatzes hängt von den Anforderungen der Anwendung, der Datenbank und
 anderen Faktoren ab. Ein guter ORM-Framework sollte Unterstützung für verschiedene
 "Inheritance Mapper" Strategien bieten.

 Hier ist ein einfaches Beispiel für das "Inheritance Mapper" Muster in Java mit dem
 Hibernate ORM-Framework und der Single Table Inheritance-Strategie.

 In diesem Beispiel haben wir eine abstrakte Klasse Fahrzeug und zwei Unterklassen Auto
 und Fahrrad. Wir verwenden die Single Table Inheritance-Strategie, bei der alle Klassen
 in der Vererbungshierarchie in einer einzigen Tabelle (Fahrzeug) gespeichert werden.
 Die @DiscriminatorColumn Annotation identifiziert den Typ des Fahrzeugs, und die
 @DiscriminatorValue Annotation in den Unterklassen spezifiziert den Wert der
 Unterscheidungsspalte für jede Klasse.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "fahrzeugtyp", discriminatorType = DiscriminatorType.STRING)
public abstract class Fahrzeug {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String marke;

  // Getter und Setter
}
