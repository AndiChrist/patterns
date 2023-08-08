package io.github.andichrist.behavioral.strategy;

// Die konkrete Implementierung der Strategie
public class ConcreteStrategyB implements Strategy {
  @Override
  public void doOperation() {
    System.out.println("ConcreteStrategyB: Operation B");
  }
}
