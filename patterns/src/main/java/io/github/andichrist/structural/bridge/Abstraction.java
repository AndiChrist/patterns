package io.github.andichrist.structural.bridge;

// Abstrakte Klasse oder Schnittstelle für die Abstraktion
public abstract class Abstraction {
  protected Implementor implementor;

  public Abstraction(Implementor implementor) {
    this.implementor = implementor;
  }

  public abstract void operation();
}

