package io.github.andichrist.other.repository.record;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    PersonRepository personRepository = new InMemoryPersonRepository();

    Person person1 = new Person("Alice", 30, "123 Main St");
    Person person2 = new Person("Bob", 25, "456 Second St");

    personRepository.save(person1);
    personRepository.save(person2);

    Person foundPerson = personRepository.findByName("Alice");
    if (foundPerson != null) {
      System.out.println("Found Person: " + foundPerson);
    }

    // Update einer Person
    Person updatedPerson = new Person("Alice", 35, "789 Third St");
    personRepository.update(updatedPerson);

    List<Person> allPersons = personRepository.findAll();
    System.out.println("All Persons: " + allPersons);
  }
}
