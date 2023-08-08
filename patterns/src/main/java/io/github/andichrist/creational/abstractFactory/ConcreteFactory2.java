package io.github.andichrist.creational.abstractFactory;

// Konkrete Fabrik 2, erzeugt Produkte der Familie 2
public class ConcreteFactory2 implements AbstractFactory {
  @Override
  public AbstractProductA createProductA() {
    return new ConcreteProductA2();
  }

  @Override
  public AbstractProductB createProductB() {
    return new ConcreteProductB2();
  }
}
