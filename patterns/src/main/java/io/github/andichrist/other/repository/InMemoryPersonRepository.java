package io.github.andichrist.other.repository;

import java.util.ArrayList;
import java.util.List;

// Die konkrete Implementierung des Repositorys
public class InMemoryPersonRepository implements PersonRepository {
  private List<Person> persons = new ArrayList<>();
  private int nextId = 1;

  @Override
  public void save(Person person) {
    person.setId(nextId++);
    persons.add(person);
  }

  @Override
  public void update(Person person) {
    for (Person p : persons) {
      if (p.getId() == person.getId()) {
        p.setName(person.getName());
        p.setAge(person.getAge());
        break;
      }
    }
  }

  @Override
  public void delete(int id) {
    persons.removeIf(p -> p.getId() == id);
  }

  @Override
  public Person findById(int id) {
    for (Person person : persons) {
      if (person.getId() == id) {
        return person;
      }
    }
    return null;
  }

  @Override
  public List<Person> findAll() {
    return new ArrayList<>(persons);
  }
}
