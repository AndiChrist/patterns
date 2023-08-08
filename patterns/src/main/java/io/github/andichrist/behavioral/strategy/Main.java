package io.github.andichrist.behavioral.strategy;

/*
 Das "Strategie"-Muster (Strategy Pattern) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Verhaltensmuster (Behavioral Pattern). Das
 Muster ermöglicht es, verschiedene Verhaltensweisen oder Algorithmen in separaten
 Klassen zu definieren und sie zur Laufzeit auszutauschen, ohne die Verwendungsklasse
 zu ändern.

 Das Hauptziel des "Strategie"-Musters besteht darin, die Algorithmen oder Verhaltensweisen
 von der Hauptklasse zu entkoppeln und sie in eigenen Strategie-Klassen zu definieren.
 Dadurch wird es möglich, das Verhalten zur Laufzeit auszutauschen, ohne die Hauptklasse
 zu ändern. Es fördert die Flexibilität und ermöglicht es, neue Verhaltensweisen
 hinzuzufügen, ohne die bestehende Funktionalität zu beeinträchtigen.

 Die wichtigsten Komponenten des "Strategie"-Musters sind:

 1. Kontext (Context): Die Klasse, die die Strategien verwendet. Sie hält eine Referenz
 auf ein Strategie-Interface und kann die Strategie zur Laufzeit ändern.

 2. Strategie (Strategy): Ein Interface oder eine abstrakte Klasse, das die Methode oder
 Methoden definiert, die von den konkreten Strategien implementiert werden.

 3. Konkrete Strategien (Concrete Strategies): Konkrete Implementierungen der Strategie,
 die die spezifischen Verhaltensweisen oder Algorithmen definieren.

 Hier ist eine vereinfachte Implementierung des "Strategie"-Musters in Java.

 Im Beispiel haben wir ein Strategie-Interface Strategy, das die Methode doOperation()
 definiert. Die konkreten Strategien ConcreteStrategyA und ConcreteStrategyB implementieren
 dieses Interface und definieren ihre spezifischen Verhaltensweisen.

 Der Kontext Context hält eine Referenz auf ein Strategie-Objekt und kann die Strategie zur
 Laufzeit ändern. Die Methode executeOperation() ruft die doOperation()-Methode des
 aktuellen Strategie-Objekts auf.

 Das "Strategie"-Muster ermöglicht es uns, Algorithmen oder Verhaltensweisen zu kapseln
 und sie zur Laufzeit auszutauschen. Dadurch wird die Flexibilität erhöht, und neue
 Verhaltensweisen können leicht hinzugefügt oder geändert werden, ohne die
 Verwendungsklasse zu beeinflussen. Es ist besonders nützlich, wenn Sie eine Klasse
 haben, die verschiedene Varianten eines Algorithmus oder Verhaltens benötigt und Sie
 diese Varianten zur Laufzeit dynamisch auswählen oder austauschen möchten.
 */
public class Main {
  public static void main(String[] args) {
    Context context = new Context();

    Strategy strategyA = new ConcreteStrategyA();
    Strategy strategyB = new ConcreteStrategyB();

    context.setStrategy(strategyA);
    context.executeOperation();
    // Ausgabe: ConcreteStrategyA: Operation A

    context.setStrategy(strategyB);
    context.executeOperation();
    // Ausgabe: ConcreteStrategyB: Operation B
  }
}
