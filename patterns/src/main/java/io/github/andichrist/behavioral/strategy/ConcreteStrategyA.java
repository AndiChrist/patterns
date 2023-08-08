package io.github.andichrist.behavioral.strategy;

// Die konkrete Implementierung der Strategie
public class ConcreteStrategyA implements Strategy {
  @Override
  public void doOperation() {
    System.out.println("ConcreteStrategyA: Operation A");
  }
}
