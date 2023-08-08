package io.github.andichrist.other.fluentInterface.record;

public class PersonBuilder {
  private String name;
  private int age;
  private String address;

  public PersonBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public PersonBuilder withAge(int age) {
    this.age = age;
    return this;
  }

  public PersonBuilder withAddress(String address) {
    this.address = address;
    return this;
  }

  public Person build() {
    return new Person(name, age, address);
  }
}
