package io.github.andichrist.structural.composite;

/*
 Das "Kompositum"-Muster (Composite Pattern) ist ein Entwurfsmuster in der
 objektorientierten Programmierung und gehört zur Kategorie der Strukturmuster
 (Structural Pattern). Das Muster ermöglicht es, einzelne Objekte und deren Kompositionen
 einheitlich zu behandeln, indem es eine Baumstruktur von "Komponenten" erstellt.

 Das "Kompositum"-Muster wird verwendet, wenn wir eine Hierarchie von Objekten haben, die
 ähnliche Operationen durchführen, unabhängig davon, ob sie einzelne Objekte oder
 Kompositionen von Objekten sind. Es ermöglicht uns, sowohl einzelne Objekte als auch
 Gruppen von Objekten (Kompositionen) gleichartig zu behandeln.

 Das Muster besteht aus drei Hauptkomponenten:

 1. Komponente (Component): Ein gemeinsames Interface oder eine abstrakte Klasse, das/die
 die Operationen definiert, die sowohl für einzelne Objekte als auch für Kompositionen
 gelten.

 2. Blatt (Leaf): Eine konkrete Implementierung der Komponente für einzelne Objekte.

 3. Kompositum (Composite): Eine konkrete Implementierung der Komponente für die
 Komposition von Objekten. Es hält eine Liste von Komponenten und implementiert die
 Operationen, indem es diese Operationen an die enthaltenen Komponenten delegiert.

 Im Beispiel haben wir eine Hierarchie von Komponenten (Component), die aus einzelnen
 Objekten (Leaf) und Kompositionen von Objekten (Composite) besteht. Die Operation
 operation() wird sowohl von einzelnen Objekten als auch von Kompositionen implementiert.
 Die Komposition Composite hält eine Liste von Komponenten, die sowohl einzelne Objekte als
 auch andere Kompositionen sein können.

 Das "Kompositum"-Muster ermöglicht es uns, sowohl einzelne Objekte als auch Gruppen von
 Objekten in einer einheitlichen Struktur zu behandeln. Es erleichtert die Arbeit mit
 komplexen Baumstrukturen und bietet eine flexible Möglichkeit, um hierarchische Beziehungen
 darzustellen.
 */
public class Main {
  public static void main(String[] args) {
    Component leaf1 = new Leaf("Leaf 1");
    Component leaf2 = new Leaf("Leaf 2");
    Component leaf3 = new Leaf("Leaf 3");

    Composite composite1 = new Composite();
    composite1.addComponent(leaf1);
    composite1.addComponent(leaf2);

    Composite composite2 = new Composite();
    composite2.addComponent(leaf3);

    Composite composite3 = new Composite();
    composite3.addComponent(composite1);
    composite3.addComponent(composite2);

    composite3.operation();
    // Ausgabe:
    // Composite operation:
    // Leaf Leaf 1 operation
    // Leaf Leaf 2 operation
    // Composite operation:
    // Leaf Leaf 3 operation
  }
}

