package io.github.andichrist.other.fluentInterface;

/*
 Das "Fluent Interface"-Muster ist ein Entwurfsmuster in der objektorientierten
 Programmierung, das es ermöglicht, Methodenaufrufe in einer Weise zu verketten, die den
 Code lesbarer und intuitiver macht. Ein Fluent Interface ermöglicht es, Methodenaufrufe
 aufeinander zu folgen, als wären sie Sätze oder Ausdrücke in einer natürlichen Sprache.

 Das Fluent Interface-Muster wird oft in der Builder-Pattern-Implementierung verwendet, um
 eine fließende Syntax zu ermöglichen, mit der Objekte schrittweise konstruiert werden
 können.

 Hier ist ein einfaches Java-Beispiel für das Fluent Interface-Muster.

 Im Beispiel haben wir das Fluent Interface-Muster implementiert, um die schrittweise
 Konstruktion einer Person zu ermöglichen. Mit dem Fluent Interface können wir
 Methodenaufrufe für die PersonBuilder-Klasse miteinander verketten, was den Code lesbarer
 und intuitiver macht.

 Das Fluent Interface-Muster wird oft verwendet, um komplexe Konfigurations- oder
 Erstellungsprozesse zu erleichtern und den Code für den Benutzer leichter lesbar und
 wartbar zu machen. Es ermöglicht eine reibungslose, fließende und natürliche Syntax,
 die den Code in einem beinahe deklarativen Stil schreiben lässt.
 */
public class Main {
  public static void main(String[] args) {
    // Verwendung des Fluent Interface zum Erstellen einer Person
    Person person = new PersonBuilder()
        .withName("Alice")
        .withAge(30)
        .withAddress("123 Main St")
        .build();

    System.out.println("Name: " + person.getName());
    System.out.println("Age: " + person.getAge());
    System.out.println("Address: " + person.getAddress());
  }
}
