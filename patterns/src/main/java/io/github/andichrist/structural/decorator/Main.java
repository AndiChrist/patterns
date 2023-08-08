package io.github.andichrist.structural.decorator;

/*
 Das "Dekorierer"-Muster ist ein Entwurfsmuster in der objektorientierten Programmierung
 und gehört zur Kategorie der Strukturmuster (Structural Pattern). Das Muster ermöglicht
 es, das Verhalten eines Objekts dynamisch zu erweitern, indem zusätzliche Funktionalitäten
 (Dekoratoren) um das ursprüngliche Objekt herum gewickelt werden, ohne die Schnittstellen
 zu ändern.

 Das "Decorator"-Muster verwendet eine Komposition, um die Funktionalität des
 Originalobjekts schrittweise zu erweitern. Es ermöglicht die Kombination mehrerer
 Dekoratoren, um unterschiedliche Kombinationen von Funktionen zu erreichen.

 Im Beispiel haben wir eine Hierarchie mit einer Basiskomponente (Component) und zwei
 konkreten Dekoratoren (ConcreteDecoratorA und ConcreteDecoratorB). Die Dekoratoren
 implementieren das gleiche Interface wie die Basiskomponente, um die Komposition und das
 Schichten von Funktionalitäten zu ermöglichen.

 Das "Decorator"-Muster erlaubt uns, das Verhalten eines Objekts dynamisch zu erweitern,
 indem wir es mit verschiedenen Dekoratoren umgeben. Dadurch bleibt die Flexibilität
 erhalten, da Dekoratoren einfach hinzugefügt oder entfernt werden können, um das Verhalten
 des ursprünglichen Objekts zu ändern, ohne die Basiskomponente selbst zu ändern.
 */
public class Main {
  public static void main(String[] args) {
    Component component = new ConcreteComponent();
    component.operation();
    // Ausgabe:
    // Concrete Component operation

    Component decoratedComponentA = new ConcreteDecoratorA(component);
    decoratedComponentA.operation();
    // Ausgabe:
    // Concrete Decorator A operation - Before
    // Concrete Component operation
    // Concrete Decorator A operation - After

    Component decoratedComponentB = new ConcreteDecoratorB(component);
    decoratedComponentB.operation();
    // Ausgabe:
    // Concrete Decorator B operation - Before
    // Concrete Component operation
    // Concrete Decorator B operation - After

    // Kombination von Dekoratoren
    Component combinedDecorators = new ConcreteDecoratorB(new ConcreteDecoratorA(component));
    combinedDecorators.operation();
    // Ausgabe:
    // Concrete Decorator B operation - Before
    // Concrete Decorator A operation - Before
    // Concrete Component operation
    // Concrete Decorator A operation - After
    // Concrete Decorator B operation - After
  }
}
