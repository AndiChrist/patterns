package io.github.andichrist.creational.builder;

public record Person(String name, int age, String address) {

  Person(Builder builder) {
    this(builder.name, builder.age, builder.address);
  }

  public static class Builder {
    private String name;
    private int age;
    private String address;

    public Builder(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public Builder setAddress(String address) {
      this.address = address;
      return this;
    }

    public Person build() {
      return new Person(this);
    }
  }
}
