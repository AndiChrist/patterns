package io.github.andichrist.creational.builder.person;

import java.time.LocalDate;

import static java.util.Objects.requireNonNull;

public record Person(String firstName, String lastName, LocalDate dateOfBirth) {

  @FunctionalInterface
  public interface FirstNameBuilder {
    LastNameBuilder firstName(String firstName);
  }

  @FunctionalInterface
  public interface LastNameBuilder {
    PersonBuilder lastName(String lastName);
  }

  public static FirstNameBuilder builder() {
    return firstName -> lastName -> new PersonBuilder(firstName, lastName);
  }

  public static class PersonBuilder {

    private final String firstName;
    private final String lastName;

    private LocalDate dateOfBirth;

    private PersonBuilder(String firstName, String lastName) {
      this.firstName = requireNonNull(firstName, "firstName cannot be null");;
      this.lastName = requireNonNull(lastName, "lastName cannot be null");
    }

    public PersonBuilder dateOfBirth(LocalDate birthday) {
      this.dateOfBirth = birthday;
      return this;
    }

    public Person build() {
      return new Person(firstName, lastName, dateOfBirth);
    }
  }
}
