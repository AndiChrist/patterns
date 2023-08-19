package io.github.andichrist.behavioral.recursiveExpansion;

/*
 Das Muster "Rekursive Erweiterung" bezieht sich auf die Idee, eine Hierarchie von Klassen oder
 Objekten zu definieren, bei der jede Klasse oder jedes Objekt eine Basisfunktionalität enthält und
 zusätzlich eine erweiterte Funktionalität in Form von spezialisierten Unterobjekten oder Unterklassen
 aufnehmen kann. Dieses Muster ermöglicht die schrittweise Erweiterung der Funktionalität auf
 verschiedenen Ebenen der Hierarchie.

 Das "Rekursive Erweiterung" Muster wird oft in der Vererbungshierarchie verwendet, um die
 Flexibilität und Erweiterbarkeit von Klassen oder Objekten zu gewährleisten, ohne die
 Kernfunktionalität zu beeinträchtigen. Es ähnelt dem Prinzip der Vererbung, ermöglicht jedoch
 eine tiefere Hierarchie von Spezialisierungen.

 Ein bekanntes Beispiel dieses Musters ist die Erweiterung von Klassen in einer Baumstruktur, wobei
 jede spezialisierte Klasse zusätzliche Eigenschaften oder Methoden zu denen ihrer Elternklassen
 hinzufügt.

 Ein häufiges Anwendungsbeispiel ist die Verwendung von Composite-Patterns in der Objektorientierten
 Programmierung. In einem solchen Fall besteht eine Komponente sowohl aus Basisfunktionalität als
 auch aus spezialisierten Unterobjekten, die selbst wiederum die Basisfunktionalität erweitern können.

 Bitte beachten Sie, dass die genaue Implementierung und Anwendung des Musters je nach
 Programmiersprache und Kontext variieren kann. Es ist wichtig, sorgfältig zu planen, wie das
 Muster in Ihrer Anwendung verwendet wird, um eine klare Hierarchie und Erweiterbarkeit sicherzustellen.

 In diesem Beispiel haben wir eine abstrakte Klasse Shape, die die Basisfunktionalität für jede
 Form darstellt. Dann haben wir zwei spezialisierte Klassen Circle und Rectangle, die von Shape
 erben. Jede dieser spezialisierten Klassen fügt spezifische Eigenschaften hinzu (Radius für Kreis,
 Breite und Höhe für Rechteck) und überschreibt die Methode area().

 Wenn wir die main-Methode ausführen, erstellen wir Instanzen von Circle und Rectangle und rufen die
 area()-Methode auf, um die Fläche jeder Form zu berechnen.

 Dieses Beispiel zeigt, wie das "Rekursive Erweiterung" Muster verwendet werden kann, um die
 Hierarchie von Klassen zu erweitern und gleichzeitig die gemeinsame Basisfunktionalität zu nutzen.
 */
public class RecursiveExpansionPatternExample {
  public static void main(String[] args) {
    Circle circle = new Circle(5.0);
    Rectangle rectangle = new Rectangle(4.0, 6.0);

    System.out.println("Circle Area: " + circle.area());
    System.out.println("Rectangle Area: " + rectangle.area());
  }
}
