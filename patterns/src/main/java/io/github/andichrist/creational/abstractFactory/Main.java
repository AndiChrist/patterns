package io.github.andichrist.creational.abstractFactory;

/*
 Die "Abstrakte Fabrik" (Abstract Factory) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört ebenfalls zur Kategorie der kreativen Erzeugungsmuster
 (Creational Pattern). Das Muster ermöglicht die Erzeugung von Familien von
 zusammengehörigen oder verwandten Objekten, ohne die spezifischen Klassen dieser Objekte
 zu kennen.

 Im Gegensatz zur Fabrikmethode, die eine einzige Methode zur Erzeugung eines einzelnen
 Produkts bereitstellt, bietet die Abstrakte Fabrik mehrere abstrakte Fabrikmethode(n),
 die jeweils eine Familie von Produkten erzeugen. Jede konkrete Fabrik, die von der
 abstrakten Fabrik abgeleitet wird, implementiert diese Methoden, um die konkreten Produkte
 zu erstellen.

 Im Beispiel haben wir zwei Produktfamilien (A und B) und zwei konkrete Fabriken
 (ConcreteFactory1 und ConcreteFactory2), die jeweils Produkte für eine Familie erzeugen.
 Der Clientcode verwendet die abstrakte Fabrik und die abstrakten Produkte, ohne die
 konkreten Klassen zu kennen, um eine Familie von zusammengehörigen Produkten zu erzeugen.

 Das Abstrakte-Fabrik-Muster fördert die Loskopplung zwischen dem Clientcode und den
 konkreten Klassen, sodass die konkreten Fabriken und Produkte einfach ausgetauscht werden
 können, ohne den Clientcode ändern zu müssen. Es ermöglicht auch die Konsistenz der
 erzeugten Produktfamilien.
 */
public class Main {
  public static void main(String[] args) {
    AbstractFactory factory1 = new ConcreteFactory1();
    AbstractProductA productA1 = factory1.createProductA();
    AbstractProductB productB1 = factory1.createProductB();

    AbstractFactory factory2 = new ConcreteFactory2();
    AbstractProductA productA2 = factory2.createProductA();
    AbstractProductB productB2 = factory2.createProductB();

    productA1.operationA(); // Ausgabe: Concrete Product A1 operation
    productB1.operationB(); // Ausgabe: Concrete Product B1 operation
    productA2.operationA(); // Ausgabe: Concrete Product A2 operation
    productB2.operationB(); // Ausgabe: Concrete Product B2 operation
  }
}

