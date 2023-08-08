package io.github.andichrist.structural.bridge;

// Eine konkrete Klasse, die von der Abstraktion erbt
public class RefinedAbstraction extends Abstraction {
  public RefinedAbstraction(Implementor implementor) {
    super(implementor);
  }

  @Override
  public void operation() {
    System.out.println("Refined Abstraction operation");
    implementor.specificOperation();
  }
}
