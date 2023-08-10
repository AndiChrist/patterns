package io.github.andichrist.behavioral.mediator;

/*
Das "Vermittler"-Muster (Mediator Pattern) ist ein Entwurfsmuster in der
objektorientierten Programmierung und gehört zur Kategorie der Verhaltensmuster
(Behavioral Pattern). Das Muster fördert die lose Kopplung zwischen Objekten, indem es
einen Vermittler oder eine zentrale Schnittstelle bereitstellt, über die Objekte
miteinander kommunizieren können, anstatt direkt miteinander zu interagieren.

Das Hauptziel des "Vermittler"-Musters besteht darin, die Kommunikation zwischen mehreren
Objekten zu entkoppeln, indem sie nicht direkt miteinander interagieren, sondern über
einen Vermittler kommunizieren. Dadurch werden Abhängigkeiten reduziert und die Wartbarkeit
und Flexibilität des Systems verbessert.

Die wichtigsten Komponenten des "Vermittler"-Musters sind:

1. Vermittler (Mediator): Ein Interface oder eine abstrakte Klasse, das die Methoden
   definiert, über die Objekte kommunizieren können. Der Vermittler hält eine Referenz auf
   die beteiligten Objekte.

2. Konkreter Vermittler (Concrete Mediator): Eine konkrete Implementierung des Vermittler-
   Interfaces, das die tatsächliche Kommunikation zwischen den Objekten verwaltet.

3. Kollege (Colleague): Ein Interface oder eine abstrakte Klasse, das die Methoden
   definiert, über die ein Objekt mit dem Vermittler kommuniziert.

4. Konkreter Kollege (Concrete Colleague): Konkrete Implementierungen der Kollegen, die
   die Methoden des Kollegen-Interfaces implementieren und mit dem Vermittler kommunizieren.

Hier ist eine vereinfachte Implementierung des "Vermittler"-Musters in Java.

Im Beispiel haben wir ein Vermittler-Interface Mediator, das die Methode sendMessage()
definiert, über die Objekte miteinander kommunizieren können. Die konkrete Implementierung
ConcreteMediator verwaltet die tatsächliche Kommunikation zwischen den Kollegen.

Das Kollege-Interface Colleague definiert die Methoden sendMessage() und receiveMessage(),
über die ein Objekt mit dem Vermittler kommunizieren kann. Die konkreten Kollegen
ConcreteColleague1 und ConcreteColleague2 implementieren dieses Interface und interagieren
mit dem Vermittler, um Nachrichten zu senden und zu empfangen.

Das "Vermittler"-Muster ermöglicht es uns, die Kommunikation zwischen Objekten zu
entkoppeln und sie über einen Vermittler kommunizieren zu lassen. Dadurch wird die
Wartbarkeit des Codes verbessert, da die Abhängigkeiten zwischen den Objekten reduziert
werden. Es ist besonders nützlich, wenn die Kommunikation zwischen mehreren Objekten
komplex wird und Sie eine zentrale Stelle für die Verwaltung der Kommunikation haben
möchten, ohne dass die beteiligten Objekte voneinander wissen müssen.
 */
public class Main {
  public static void main(String[] args) {
    ConcreteMediator mediator = new ConcreteMediator();

    ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
    ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

    mediator.setColleague1(colleague1);
    mediator.setColleague2(colleague2);

    colleague1.sendMessage("Hello from Colleague 1!");
    // Ausgabe: ConcreteColleague2 received: Hello from Colleague 1!

    colleague2.sendMessage("Hi from Colleague 2!");
    // Ausgabe: ConcreteColleague1 received: Hi from Colleague 2!
  }
}
