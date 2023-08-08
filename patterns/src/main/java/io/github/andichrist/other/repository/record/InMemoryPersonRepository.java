package io.github.andichrist.other.repository.record;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPersonRepository implements PersonRepository {
  private List<Person> persons = new ArrayList<>();

  @Override
  public void save(Person person) {
    persons.add(person);
  }

  @Override
  public void update(Person updatedPerson) {
    Person existingPerson = findByName(updatedPerson.name());
    if (existingPerson != null) {
      persons.remove(existingPerson);
      persons.add(updatedPerson);
    } else {
      System.out.println("Person with name '" + updatedPerson.name() + "' not found.");
    }
  }

  @Override
  public void delete(String name) {
    persons.removeIf(person -> person.name().equals(name));
  }

  @Override
  public Person findByName(String name) {
    return persons.stream()
        .filter(person -> person.name().equals(name))
        .findFirst()
        .orElse(null);
  }

  @Override
  public List<Person> findAll() {
    return new ArrayList<>(persons);
  }
}
