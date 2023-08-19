package io.github.andichrist.behavioral.recursiveExpansion;

/*
 Das "Rekursive Erweiterung" Muster bezieht sich normalerweise darauf, dass jede Klasse in der
 Hierarchie eine "Rekursion" der Basisfunktionalität in spezialisierten Unterobjekten oder
 Unterklassen ermöglicht. Ein klassisches Beispiel dafür ist das Composite-Muster, bei dem
 Komponenten sowohl Basisfunktionalität als auch spezialisierte Unterobjekte umfassen, die denselben
 Vertrag (Schnittstelle oder abstrakte Klasse) erfüllen.

 Hier ist ein einfaches Beispiel, das das "Rekursive Erweiterung" Muster unter Verwendung des
 Composite-Musters zeigt.

 In diesem Beispiel haben wir das Composite-Muster verwendet, um das "Rekursive Erweiterung" Muster
 zu veranschaulichen. Die Composite-Klasse kann sowohl Leaf-Instanzen als auch andere Composite-
 Instanzen enthalten. Wenn die operation()-Methode aufgerufen wird, wird die Basisfunktionalität in
 der Composite-Klasse ausgeführt und dann in allen enthaltenen Komponenten rekursiv aufgerufen.
 */
public class RecursiveExpansionPatternExample {
  public static void main(String[] args) {
    Component leaf1 = new Leaf();
    Component leaf2 = new Leaf();

    Composite composite = new Composite();
    composite.addComponent(leaf1);
    composite.addComponent(leaf2);

    composite.operation();
  }
}
