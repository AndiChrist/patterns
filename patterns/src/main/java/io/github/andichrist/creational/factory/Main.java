package io.github.andichrist.creational.factory;

/*
 Die "Fabrikmethode" (Factory Method) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der kreativen Erzeugungsmuster (Creational
 Pattern). Anders als das Singleton-Muster, das sicherstellt, dass eine Klasse nur eine
 einzige Instanz hat, zielt die Fabrikmethode darauf ab, die Erzeugung von Objekten in
 Unterklassen zu delegieren, anstatt sie direkt in der Basisklasse zu instanziieren.

 Das Factory-Methode-Muster wird verwendet, wenn eine Klasse eine abstrakte Methode
 bereitstellt, die von abgeleiteten Klassen implementiert werden muss, um eine Instanz
 der Klasse zu erstellen. Auf diese Weise kann die Basisklasse die genaue Klasse des zu
 erstellenden Objekts nicht kennen, wodurch die Abhängigkeiten zwischen Basisklasse und
 abgeleiteten Klassen gelockert werden.

 In diesem Beispiel definiert die abstrakte Klasse Creator die Fabrikmethode factoryMethod,
 die eine Instanz des abstrakten Produkts Product erzeugt. Die konkreten Klassen
 ConcreteCreatorA und ConcreteCreatorB überschreiben diese Fabrikmethode, um jeweils ihre
 spezifischen konkreten Produkte ConcreteProductA und ConcreteProductB zu erzeugen.

 Die Fabrikmethode ermöglicht eine lose Kopplung zwischen den Klassen und fördert das
 "Open-Closed Principle", da neue Produkte einfach durch Hinzufügen neuer Unterklassen von
 Creator erstellt werden können, ohne die Basisklasse zu ändern. Dadurch wird die
 Erweiterbarkeit des Codes verbessert und die Abhängigkeiten reduziert.
 */
public class Main {
  public static void main(String[] args) {
    Creator creatorA = new ConcreteCreatorA();
    Product productA = creatorA.factoryMethod();
    productA.operation();

    Creator creatorB = new ConcreteCreatorB();
    Product productB = creatorB.factoryMethod();
    productB.operation();
  }
}

