package io.github.andichrist.other.specification;


import java.util.ArrayList;
import java.util.List;

class PersonFilter {
  public static List<Person> filterBySpecification(List<Person> persons, Specification<Person> specification) {
    List<Person> result = new ArrayList<>();
    for (Person person : persons) {
      if (specification.isSatisfied(person)) {
        result.add(person);
      }
    }
    return result;
  }
}
