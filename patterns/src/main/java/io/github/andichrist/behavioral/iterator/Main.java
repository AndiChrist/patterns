package io.github.andichrist.behavioral.iterator;

/*
 Das "Iterator"-Muster (Iterator Pattern) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Verhaltensmuster (Behavioral Pattern). Das
 Muster wird verwendet, um eine Möglichkeit bereitzustellen, sequenziell auf die Elemente
 einer Sammlung (z. B. Liste, Array, Baum) zuzugreifen, ohne die zugrunde liegende Struktur
 zu kennen.

 Das Hauptziel des "Iterator"-Musters besteht darin, den Zugriff auf Elemente einer
 Sammlung zu vereinfachen, ohne die Details der internen Struktur preiszugeben. Dadurch
 wird die Sammlung von der Iteration entkoppelt und es wird eine einheitliche Art und
 Weise bereitgestellt, um durch die Elemente zu navigieren.

 Die wichtigsten Komponenten des "Iterator"-Musters sind:

 1. Iterator (Iterator): Ein Interface, das Methoden wie hasNext() zum Überprüfen, ob
 weitere Elemente vorhanden sind, und next() zum Abrufen des nächsten Elements definiert.

 2. Konkreter Iterator (Concrete Iterator): Eine konkrete Implementierung des Iterators,
 das die Methoden des Iterators implementiert, um die Iteration über die Sammlung
 durchzuführen.

 3. Aggregat (Aggregate): Ein Interface, das eine Methode zum Erhalten eines Iterators
 zurückgibt.

 4. Konkretes Aggregat (Concrete Aggregate): Eine konkrete Implementierung des Aggregats,
 das den konkreten Iterator zurückgibt.

 Hier ist eine vereinfachte Implementierung des "Iterator"-Musters in Java.

 Im Beispiel haben wir ein Interface Iterator, das die Methoden hasNext() und next()
 definiert, um die Iteration über die Sammlung durchzuführen. Das Interface Aggregate
 definiert die Methode iterator(), um einen Iterator zurückzugeben.

 Die konkrete Implementierung ConcreteIterator implementiert den Iterator und verwendet
 ein Array, um die Iteration über die Elemente durchzuführen.

 Die konkrete Implementierung ConcreteAggregate implementiert das Aggregat und gibt den
 konkreten Iterator zurück, der auf das Array der Elemente zugreift.

 Das "Iterator"-Muster ermöglicht es uns, eine einheitliche Art und Weise zum Durchlaufen
 von Sammlungen zu haben, ohne dass der Client die interne Struktur kennen muss. Dadurch
 wird die Flexibilität erhöht, und die Sammlung kann leicht ausgetauscht oder erweitert
 werden, ohne dass der Client-Code geändert werden muss.
 */
public class Main {
  public static void main(String[] args) {
    String[] names = {"Alice", "Bob", "Charlie"};

    Aggregate<String> aggregate = new ConcreteAggregate<>(names);
    Iterator<String> iterator = aggregate.iterator();

    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    // Ausgabe:
    // Alice
    // Bob
    // Charlie
  }
}
