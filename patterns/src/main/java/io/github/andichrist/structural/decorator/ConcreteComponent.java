package io.github.andichrist.structural.decorator;

// Die konkrete Implementierung der Basiskomponente
public class ConcreteComponent implements Component {
  @Override
  public void operation() {
    System.out.println("Concrete Component operation");
  }
}
