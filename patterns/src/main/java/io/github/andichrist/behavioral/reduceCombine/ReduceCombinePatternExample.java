package io.github.andichrist.behavioral.reduceCombine;

import java.util.List;

/*
 Das "Reduce/Combine" Muster, manchmal auch als "Fold/Combine" oder "Aggregate" bezeichnet, ist
 ein Konzept in der funktionalen Programmierung, das sich auf das Aggregieren von Daten durch
 Reduzieren und Kombinieren von Werten bezieht. Es ist eng verwandt mit dem "MapReduce" Muster,
 aber es fokussiert sich mehr auf die Aggregation von Daten durch Reduktion und Zusammenführung.

 Das "Reduce/Combine" Muster verwendet normalerweise zwei Hauptoperationen:

 1. Reduce (Falten): Die "Reduce"-Operation führt eine sequentielle Aggregation von Werten
    durch. Sie nimmt eine Liste von Werten und wendet eine Funktion auf jedes Paar von Werten
    an, um sie zu einem einzigen Wert zu reduzieren. Das Ergebnis wird schrittweise durch die
    Liste von Werten aufgebaut.

 2. Combine (Zusammenführen): Die "Combine"-Operation führt die Zusammenführung der reduzierten
    Werte zusammen, um das endgültige Aggregat zu erzeugen. Dieser Schritt kann paralleler sein,
    da er unabhängig reduzierte Werte zusammenfasst.

 In diesem Beispiel verwenden wir die generische reduce-Methode, um die Summe und das Produkt
 von Zahlen in der Liste zu berechnen. Die Reducer-Schnittstelle definiert die reduce-Methode,
 die die Reduktionslogik beschreibt.

 Das "Reduce/Combine" Muster wird häufig in funktionalen Programmiersprachen und Bibliotheken
 verwendet, um Berechnungen auf Listen, Arrays oder anderen Sammlungen von Werten durchzuführen.
 Es ermöglicht die Aggregation von Daten auf eine strukturierte und wiederverwendbare Weise.
 */
public class ReduceCombinePatternExample {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    int sum = reduce(numbers, 0, (acc, num) -> acc + num);
    int product = reduce(numbers, 1, (acc, num) -> acc * num);

    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
  }

  // Generisches Reduzieren und Kombinieren
  public static <T, R> R reduce(List<T> items, R initialValue, Reducer<T, R> reducer) {
    R result = initialValue;
    for (T item : items) {
      result = reducer.reduce(result, item);
    }
    return result;
  }

  // Funktionaler Reduzierer
  interface Reducer<T, R> {
    R reduce(R accumulated, T item);
  }
}
