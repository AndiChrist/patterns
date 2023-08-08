package io.github.andichrist.creational.builder.person;

import java.time.LocalDate;
import java.time.Month;

public class Main {
  public static void main(String[] args) {
    Person person = Person.builder()
        .firstName("Hugo")
        .lastName("koko")
        .dateOfBirth(null)
        .build();

    Person person2 = Person.builder()
        .firstName("John")
        .lastName("Doe")
        .build();

    Person person3 = Person.builder()
        .firstName("John")
        .lastName("Doe")
        .dateOfBirth(LocalDate.of(1998, Month.DECEMBER, 19))
        .build();

    System.out.println(person);
    System.out.println(person2);
    System.out.println(person3);
  }
}
