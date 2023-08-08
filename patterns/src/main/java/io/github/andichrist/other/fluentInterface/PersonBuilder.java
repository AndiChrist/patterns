package io.github.andichrist.other.fluentInterface;

public class PersonBuilder {
  private Person person;

  public PersonBuilder() {
    person = new Person();
  }

  public PersonBuilder withName(String name) {
    person.setName(name);
    return this;
  }

  public PersonBuilder withAge(int age) {
    person.setAge(age);
    return this;
  }

  public PersonBuilder withAddress(String address) {
    person.setAddress(address);
    return this;
  }

  public Person build() {
    return person;
  }
}
