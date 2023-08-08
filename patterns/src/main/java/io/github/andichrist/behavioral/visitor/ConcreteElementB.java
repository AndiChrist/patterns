package io.github.andichrist.behavioral.visitor;

// Die konkrete Implementierung des Elements
public class ConcreteElementB implements Element {
  @Override
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementB(this);
  }

  public String operationB() {
    return "ConcreteElementB operation";
  }
}
