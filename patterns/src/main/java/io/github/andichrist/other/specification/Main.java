package io.github.andichrist.other.specification;

import java.util.List;

/*
 Das "Specification"-Muster ist ein Entwurfsmuster, das verwendet wird, um komplexe Such-
 oder Auswahlkriterien zu kapseln und zu abstrahieren. Es ermöglicht, diese Kriterien
 als separate Spezifikationen zu definieren und dann auf verschiedene Objekte anzuwenden,
 um zu überprüfen, ob sie die Spezifikation erfüllen oder nicht.

 Hier ist ein einfaches Java-Beispiel für das "Specification"-Muster.

 Im Beispiel haben wir das "Specification"-Muster implementiert, um komplexe Suchkriterien
 für Personen zu kapseln und zu abstrahieren. Wir haben zwei konkrete Spezifikationen
 erstellt: eine, um nach Personen über 18 Jahren zu filtern, und eine andere, um nach
 Personen zu filtern, deren Namen mit einem bestimmten Buchstaben beginnen.

 Die Klasse PersonFilter enthält eine statische Methode, um die Personenliste basierend
 auf einer gegebenen Spezifikation zu filtern. Dadurch können wir die Filterlogik flexibel
 anwenden und verschiedene Kriterien definieren, ohne den Code jedes Mal ändern zu müssen.

 Das "Specification"-Muster ist nützlich, um die Filterlogik zu kapseln und zu abstrahieren,
 sodass wir verschiedene Spezifikationen kombinieren und leichter warten und erweitern
 können, wenn sich die Anforderungen ändern.
 */
public class Main {
  public static void main(String[] args) {
    List<Person> persons = List.of(
        new Person("Alice", 25),
        new Person("Bob", 30),
        new Person("Charlie", 17)
    );

    // Verwendung der konkreten Spezifikationen, um Personen zu filtern
    List<Person> adults = PersonFilter.filterBySpecification(persons, new AgeGreaterThanSpecification(18));
    System.out.println("Adults: " + adults);

    List<Person> nameStartsWithA = PersonFilter.filterBySpecification(persons, new NameStartsWithSpecification('A'));
    System.out.println("Names starting with 'A': " + nameStartsWithA);
  }
}
