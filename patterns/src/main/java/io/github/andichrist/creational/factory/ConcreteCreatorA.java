package io.github.andichrist.creational.factory;

public class ConcreteCreatorA extends Creator {
  @Override
  public Product factoryMethod() {
    return new ConcreteProductA();
  }
}
