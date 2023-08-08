package io.github.andichrist.structural.bridge;

/*
 Das "Brücke"-Muster (Bridge Pattern) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Strukturmuster (Structural Pattern). Es wird
 verwendet, um eine lose Kopplung zwischen Abstraktion und Implementierung zu ermöglichen,
 indem es diese beiden Hierarchien voneinander trennt.

 Das "Brücke"-Muster wird eingesetzt, wenn es eine mehrdimensionale Hierarchie von Klassen
 gibt, bei der eine Abstraktion mit verschiedenen Implementierungen kombiniert werden muss.
 Es ermöglicht, dass die Abstraktion und Implementierung unabhängig voneinander variiert
 werden können.

 Das Muster verwendet eine "Brücke", die eine Verbindung zwischen der Abstraktion und der
 Implementierung herstellt, ohne dass sie direkt miteinander verbunden sind.

 Im Beispiel haben wir eine Hierarchie von "Abstraction" und "Implementor". Die "Abstraction"
 ist die Abstrakte Klasse oder Schnittstelle, die die Implementierung der "Implementor"-
 Schnittstelle hält. Die "ConcreteImplementorA" und "ConcreteImplementorB" sind verschiedene
 konkrete Implementierungen der "Implementor"-Schnittstelle. Die "RefinedAbstraction" ist
 eine konkrete Klasse, die von "Abstraction" erbt und die gewünschte Funktionalität durch
 Kombination mit einer konkreten Implementierung erreicht.

 Das "Brücke"-Muster ermöglicht es uns, die Abstraktion und Implementierung unabhängig
 voneinander zu ändern, wodurch die Flexibilität des Codes erhöht wird. Es hilft auch, eine
 explizite Bindung zwischen Abstraktion und Implementierung zu vermeiden und fördert das
 "Open-Closed Principle".
 */
public class Main {
  public static void main(String[] args) {
    Implementor implementorA = new ConcreteImplementorA();
    Implementor implementorB = new ConcreteImplementorB();

    Abstraction abstractionA = new RefinedAbstraction(implementorA);
    abstractionA.operation();
    // Ausgabe:
    // Refined Abstraction operation
    // Concrete Implementor A specific operation

    Abstraction abstractionB = new RefinedAbstraction(implementorB);
    abstractionB.operation();
    // Ausgabe:
    // Refined Abstraction operation
    // Concrete Implementor B specific operation
  }
}
