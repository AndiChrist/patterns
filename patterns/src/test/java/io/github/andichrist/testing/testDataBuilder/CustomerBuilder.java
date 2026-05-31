package io.github.andichrist.testing.testDataBuilder;

// Test Data Builder (verwandt mit dem Object Mother): erzeugt valide Customer-Objekte
// mit sinnvollen Defaults. Tests überschreiben nur das, was für den Fall relevant ist.
public class CustomerBuilder {
  private String name = "Max Mustermann";
  private String email = "max@example.com";
  private int age = 30;
  private boolean active = true;

  public static CustomerBuilder aCustomer() {
    return new CustomerBuilder();
  }

  public CustomerBuilder withName(String name) {
    this.name = name;
    return this;
  }

  public CustomerBuilder withEmail(String email) {
    this.email = email;
    return this;
  }

  public CustomerBuilder withAge(int age) {
    this.age = age;
    return this;
  }

  public CustomerBuilder inactive() {
    this.active = false;
    return this;
  }

  public Customer build() {
    return new Customer(name, email, age, active);
  }
}
