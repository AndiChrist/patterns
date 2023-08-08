package io.github.andichrist.other.repository;

import java.util.List;

// Das Repository-Interface
public interface PersonRepository {
  void save(Person person);
  void update(Person person);
  void delete(int id);
  Person findById(int id);
  List<Person> findAll();
}
