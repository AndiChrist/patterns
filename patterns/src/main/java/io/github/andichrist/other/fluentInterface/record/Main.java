package io.github.andichrist.other.fluentInterface.record;

public class Main {
  public static void main(String[] args) {
    // Verwendung des Fluent Interface zum Erstellen einer Person
    Person person = new PersonBuilder()
        .withName("Alice")
        .withAge(30)
        .withAddress("123 Main St")
        .build();

    System.out.println("Name: " + person.name());
    System.out.println("Age: " + person.age());
    System.out.println("Address: " + person.address());
  }
}
