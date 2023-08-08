package io.github.andichrist.other.specification;

// Eine weitere konkrete Spezifikation, die prüft, ob der Name mit einem bestimmten Buchstaben beginnt
class NameStartsWithSpecification implements Specification<Person> {
  private char startsWith;

  public NameStartsWithSpecification(char startsWith) {
    this.startsWith = startsWith;
  }

  @Override
  public boolean isSatisfied(Person person) {
    return person.getName().charAt(0) == startsWith;
  }
}