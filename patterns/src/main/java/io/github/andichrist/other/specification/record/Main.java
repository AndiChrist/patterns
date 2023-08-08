package io.github.andichrist.other.specification.record;

import java.util.List;

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
