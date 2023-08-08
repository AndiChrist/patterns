package io.github.andichrist.behavioral.visitor;

/*
 Das "Besucher"-Muster (Visitor Pattern) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Verhaltensmuster (Behavioral Pattern). Das
 Muster ermöglicht es, eine neue Operation zu definieren, die auf die Elemente einer
 Objektstruktur angewendet werden kann, ohne die Klassen der Elemente selbst zu ändern.

 Das "Besucher"-Muster verwendet eine separate Besucher-Klasse, die die neue Operation
 implementiert, und ermöglicht es, diese Operation auf verschiedene Elemente der
 Objektstruktur anzuwenden, ohne ihre Klassen zu ändern. Es ermöglicht somit das
 Hinzufügen neuer Funktionen oder Operationen zu einer Klassenstruktur, ohne die Klassen
 selbst zu verändern.

 Die wichtigsten Komponenten des "Besucher"-Musters sind:

 1. Element (Element): Eine Schnittstelle oder eine abstrakte Klasse, die eine accept-Methode
 definiert, die einen Besucher akzeptiert.

 2. Konkretes Element (Concrete Element): Eine konkrete Implementierung des Elements, das
 die accept-Methode implementiert.

 3. Besucher (Visitor): Eine Schnittstelle oder eine abstrakte Klasse, die die visit-Methoden
 für jedes konkrete Element definiert.

 4. Konkreter Besucher (Concrete Visitor): Eine konkrete Implementierung des Besuchers,
 das die visit-Methoden implementiert, um die neue Operation für jedes konkrete Element
 auszuführen.

 Hier ist eine vereinfachte Implementierung des "Besucher"-Musters in Java.

 Im Beispiel haben wir ein Interface Element, das die accept()-Methode definiert, die
 einen Besucher akzeptiert. Die konkreten Elemente ConcreteElementA und ConcreteElementB
 implementieren dieses Interface und implementieren ihre spezifische accept()-Methode.

 Das Interface Visitor definiert die visit()-Methoden für jedes konkrete Element. Die
 konkrete Implementierung ConcreteVisitor implementiert dieses Interface und definiert,
 wie die neue Operation für jedes Element ausgeführt werden soll.

 Das "Besucher"-Muster ermöglicht es uns, eine neue Operation auf verschiedene Elemente
 einer Objektstruktur anzuwenden, ohne die Klassen der Elemente selbst zu ändern. Es
 bietet eine flexible Möglichkeit, zusätzliche Funktionen zu einer Klassenstruktur
 hinzuzufügen, ohne die vorhandenen Klassen zu beeinträchtigen. Es ist besonders
 nützlich, wenn es viele verschiedene Operationen gibt, die auf eine Objektstruktur
 angewendet werden sollen, und wenn das Hinzufügen neuer Operationen oder Funktionen
 erforderlich ist, ohne die existierende Struktur zu verändern.
 */
public class Main {
  public static void main(String[] args) {
    Element elementA = new ConcreteElementA();
    Element elementB = new ConcreteElementB();

    Visitor visitor = new ConcreteVisitor();

    elementA.accept(visitor);
    elementB.accept(visitor);
    // Ausgabe:
    // ConcreteElementA operation visited by ConcreteVisitor
    // ConcreteElementB operation visited by ConcreteVisitor
  }
}

