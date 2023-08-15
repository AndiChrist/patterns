package io.github.andichrist.behavioral.accumulator;

import java.util.List;

/*
 Das "Accumulator" Muster, auch als "Aggregator" Muster bekannt, ist ein Entwurfsmuster, das
 verwendet wird, um Elemente zu sammeln, zu kombinieren oder zu aggregieren, um ein Endergebnis
 zu erzeugen. Dieses Muster findet Anwendung, wenn Sie eine Menge von Elementen haben und diese
 schrittweise zusammenführen möchten, um eine Gesamtsumme, einen Durchschnitt, ein komplexes
 Objekt oder eine andere Form des Aggregats zu erhalten.

 Das "Accumulator" Muster ist insbesondere in Fällen nützlich, in denen das Sammeln oder
 Aggregieren von Daten auf eine systematische Weise erfolgen soll. Es kann auch zur Berechnung
 von Zwischen- oder Endergebnissen in komplexen Berechnungen verwendet werden.

 In diesem Beispiel haben wir eine generische accumulate-Methode erstellt, die eine Liste von
 Elementen und einen Aggregator akzeptiert, um die Aggregation durchzuführen. Die Aggregator-
 Schnittstelle definiert eine Methode aggregate, die das Aggregationsverhalten beschreibt.

 Wir verwenden das "Accumulator" Muster, um die Summe und den Durchschnitt der Zahlen in der
 Liste zu berechnen. Dies wird durch die Verwendung einer Lambda-Funktion als Aggregator
 erreicht, die die Aggregationslogik enthält.

 Bitte beachten Sie, dass dies nur ein einfaches Beispiel ist, um das Konzept des "Accumulator"
 Musters zu zeigen. In der Praxis können Sie dieses Muster verwenden, um komplexere
 Aggregations- und Zusammenführungslogik zu implementieren, insbesondere wenn Sie mit größeren
 Datenmengen oder komplexen Datenstrukturen arbeiten.
 */
public class AccumulatorPatternExample {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);

    int sum = accumulate(numbers, 0, (acc, num) -> acc + num);
    double average = accumulate(numbers, 0.0, (acc, num) -> acc + num) / numbers.size();

    System.out.println("Sum: " + sum);
    System.out.println("Average: " + average);
  }

  // Generisches Aggregationsverfahren
  public static <T, R> R accumulate(List<T> items, R initialValue, Aggregator<T, R> aggregator) {
    R result = initialValue;
    for (T item : items) {
      result = aggregator.aggregate(result, item);
    }
    return result;
  }

  // Funktionaler Aggregator
  interface Aggregator<T, R> {
    R aggregate(R accumulated, T item);
  }
}

