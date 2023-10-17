package io.github.andichrist.behavioral.forkJoin;

import java.util.Arrays;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

/*
 Das Fork/Join-Entwurfsmuster, das oft auch als Scatter/Gather-Entwurfsmuster bezeichnet wird, ist in
 Java sehr nützlich, insbesondere wenn Sie parallelisierbare Aufgaben ausführen möchten. Es basiert auf
 dem Teilen und Erobern-Ansatz, bei dem eine Aufgabe in kleinere Teilaufgaben unterteilt wird, die
 parallel verarbeitet werden, und dann werden die Ergebnisse zusammengeführt. Das Fork/Join-Framework
 wurde in Java 7 eingeführt und erleichtert die Implementierung dieses Musters erheblich.

 Hier ist ein einfaches Beispiel in Java, das das Fork/Join-Entwurfsmuster verwendet, um die Summe einer
 Liste von Zahlen zu berechnen.

 In diesem Beispiel wird die SumTask-Klasse erstellt, um die Aufteilung und Berechnung der Summe der
 Zahlen zu verwalten. Wenn die Aufgaben klein genug sind, wird die Summe direkt berechnet. Andernfalls
 werden die Aufgaben in zwei Teilaufgaben aufgeteilt und parallel mit fork() und join() ausgeführt.

 Das Fork/Join-Framework kümmert sich automatisch um die Thread-Pool-Verwaltung und Parallelisierung.
 Es ist besonders nützlich für rechenintensive Aufgaben, die parallel verarbeitet werden können.

 siehe auch: https://blogs.oracle.com/javamagazine/post/virtual-threads-futures
 */
public class ForkJoinExample {

  public static void main(String[] args) {
    int[] numbers = new int[20]; // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    Arrays.setAll(numbers, p -> p + 1);

    ForkJoinPool pool = new ForkJoinPool();
    long result = pool.invoke(new SumTask(numbers, 0, numbers.length));

    System.out.println("Sum: " + result);
  }

  static class SumTask extends RecursiveTask<Long> {
    private int[] numbers;
    private int start;
    private int end;

    public SumTask(int[] numbers, int start, int end) {
      System.out.println(Thread.currentThread().getName() + " : " + start + " - " + end);
      this.numbers = numbers;
      this.start = start;
      this.end = end;
    }

    @Override
    protected Long compute() {
      if (end - start <= 2) { // Kleinere Aufgaben direkt berechnen
        long sum = 0;
        for (int i = start; i < end; i++) {
          sum += numbers[i];
        }
        return sum;
      } else {
        int middle = (start + end) / 2;
        SumTask leftTask = new SumTask(numbers, start, middle);
        SumTask rightTask = new SumTask(numbers, middle, end);

        leftTask.fork(); // Teilaufgaben parallel ausführen
        long rightResult = rightTask.compute();
        long leftResult = leftTask.join();

        return leftResult + rightResult;
      }
    }
  }
}
