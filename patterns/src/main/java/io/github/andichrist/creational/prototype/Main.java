package io.github.andichrist.creational.prototype;

/*
 Das "Prototyp"-Muster (Prototype Pattern) ist ein Entwurfsmuster in der
 objektorientierten Programmierung und gehört zur Kategorie der Erzeugungsmuster
 (Creational Pattern). Das Muster wird verwendet, um das Erstellen neuer Objekte zu
 vereinfachen, indem es eine Art Klonen oder Kopieren von bestehenden Objekten ermöglicht.

 Das Hauptziel des "Prototyp"-Musters ist es, das Erstellen von Objekten effizienter zu
 gestalten, indem teure Erstellungsvorgänge vermieden werden. Anstatt ein neues Objekt
 von Grund auf zu erstellen, wird ein vorhandenes Objekt als Prototyp verwendet, und
 daraus werden Kopien erstellt.

 Es gibt zwei Hauptansätze für die Implementierung des "Prototyp"-Musters:

 1. Flaches Klonen: Die Prototyp-Objekte werden mithilfe der clone()-Methode (aus der
    Cloneable-Schnittstelle) geklont.

 2. Tiefes Klonen: Die gesamte Objektstruktur wird vollständig geklont, einschließlich
    aller enthaltenen Objekte.

 Es ist wichtig zu beachten, dass das Klonen manchmal tiefe Kopien von Objekten erstellt,
 was bedeuten kann, dass die Klonoperation teuer sein kann, wenn die Objektstruktur
 komplex ist.

 Hier ist eine vereinfachte Implementierung des "Prototyp"-Musters in Java.

 Im Beispiel haben wir ein Interface Prototype, das die clone()-Methode definiert, die von
 den Prototyp-Objekten implementiert wird. Die konkrete Implementierung ConcretePrototype
 erstellt eine einfache flache Kopie des Objekts, indem sie ein neues Objekt mit dem
 gleichen Wert erstellt.

 Das "Prototyp"-Muster ermöglicht es uns, effizient neue Objekte zu erstellen, indem wir
 vorhandene Objekte klonen und anpassen, anstatt sie von Grund auf neu zu erstellen. Es
 ist besonders nützlich, wenn die Erstellung neuer Objekte teuer ist oder wenn eine
 Variation eines bestehenden Objekts benötigt wird.
 */
public class Main {
  public static void main(String[] args) {
    ConcretePrototype prototype = new ConcretePrototype(10);
    ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();

    System.out.println("Original Value: " + prototype.getValue());
    System.out.println("Cloned Value: " + clonedPrototype.getValue());
    // Ausgabe:
    // Original Value: 10
    // Cloned Value: 10

    // Ändere den Wert des geklonten Prototyps
    clonedPrototype.setValue(20);

    System.out.println("Original Value after cloning: " + prototype.getValue());
    System.out.println("Cloned Value after modification: " + clonedPrototype.getValue());
    // Ausgabe:
    // Original Value after cloning: 10
    // Cloned Value after modification: 20
  }
}

