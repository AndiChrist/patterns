package io.github.andichrist.other.specification.record;

// Eine konkrete Spezifikation, die prüft, ob das Alter größer als 18 ist
class AgeGreaterThanSpecification implements Specification<Person> {
  private int minAge;

  public AgeGreaterThanSpecification(int minAge) {
    this.minAge = minAge;
  }

  @Override
  public boolean isSatisfied(Person person) {
    return person.age() > minAge;
  }
}