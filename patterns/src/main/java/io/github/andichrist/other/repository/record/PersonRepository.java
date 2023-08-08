package io.github.andichrist.other.repository.record;

import java.util.List;

public interface PersonRepository {
  void save(Person person);
  void update(Person person);
  void delete(String name);
  Person findByName(String name);
  List<Person> findAll();
}
