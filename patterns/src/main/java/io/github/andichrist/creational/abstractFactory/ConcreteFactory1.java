package io.github.andichrist.creational.abstractFactory;

// Konkrete Fabrik 1, erzeugt Produkte der Familie 1
public class ConcreteFactory1 implements AbstractFactory {
  @Override
  public AbstractProductA createProductA() {
    return new ConcreteProductA1();
  }

  @Override
  public AbstractProductB createProductB() {
    return new ConcreteProductB1();
  }
}
