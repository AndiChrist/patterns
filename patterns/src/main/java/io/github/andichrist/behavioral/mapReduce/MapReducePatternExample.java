package io.github.andichrist.behavioral.mapReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 Bei dem "MapReduce" Entwurfsmuster handelt es sich um ein Paradigma zur Verarbeitung und
 Analyse großer Datenmengen, das auf die gleichzeitige Anwendung von zwei Hauptfunktionen,
 "Map" und "Reduce", auf die Daten abzielt. Dieses Paradigma wurde populär durch seine
 Implementierung in der Google-Programmierbibliothek und -Plattform "Google MapReduce" und
 wurde später in vielen Big Data Frameworks, darunter Apache Hadoop, umgesetzt.

 Hier ist eine kurze Erläuterung der beiden Hauptfunktionen:

 1. Map: Die "Map"-Funktion wird auf jedes Element der Eingabedaten angewendet und erzeugt ein
    Schlüssel-Wert-Paar als Zwischenergebnis. Diese Funktion dient zur Aufteilung und
    Vorverarbeitung der Daten.

 2. Reduce: Die "Reduce"-Funktion gruppiert die Zwischenergebnisse nach Schlüsseln und führt
    eine Zusammenführung oder Aggregation durch, um das endgültige Ergebnis zu erzeugen. Diese
    Funktion verarbeitet die Daten aus der "Map"-Phase und generiert das endgültige
    Ausgaberesultat.

 Das "MapReduce" Entwurfsmuster ermöglicht die parallele Verarbeitung von großen Datenmengen
 auf verteilten Systemen. Es bietet eine effiziente Möglichkeit, Daten zu verarbeiten, ohne
 dass alle Daten gleichzeitig im Hauptspeicher gehalten werden müssen. Das Muster ist besonders
 nützlich für aufteilbare Berechnungen, bei denen die Verarbeitung von Teilen der Daten
 unabhängig voneinander durchgeführt werden kann.

 In diesem Beispiel verwenden wir die Java Streams-API, um das "MapReduce" Muster zu
 implementieren. Die "Map"-Phase erfolgt durch die Verwendung des groupingBy-Collectors, um die
 Wörter zu zählen. Die "Reduce"-Phase erfolgt durch die Verwendung der forEach-Methode, um die
 Ergebnisse anzuzeigen.

 Bitte beachten Sie, dass dies ein vereinfachtes Beispiel ist, um das Konzept zu
 veranschaulichen. In großen Big Data-Anwendungen wird das "MapReduce" Muster in der Regel auf
 Daten verteilt und von verteilten Systemen mit umfangreicher Parallelverarbeitung und
 optimierter Datenspeicherung verwendet.
 */
public class MapReducePatternExample {
  public static void main(String[] args) {
    List<String> words = Arrays.asList("apple", "banana", "cherry", "apple", "banana", "apple");

    // Map-Phase: Zählen der Wörter
    Map<String, Long> wordCounts = words.stream()
        .collect(Collectors.groupingBy(w -> w, Collectors.counting()));

    // Reduce-Phase: Anzeigen der Ergebnisse
    wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));
  }
}

