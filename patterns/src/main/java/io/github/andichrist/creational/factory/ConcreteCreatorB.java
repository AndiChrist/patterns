package io.github.andichrist.creational.factory;

public class ConcreteCreatorB extends Creator {
  @Override
  public Product factoryMethod() {
    return new ConcreteProductB();
  }
}
