package io.github.andichrist.behavioral.strategy;

// Der Kontext
public class Context {
  private Strategy strategy;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public void executeOperation() {
    strategy.doOperation();
  }
}
