package io.github.andichrist.behavioral.visitor;

// Die konkrete Implementierung des Elements
public class ConcreteElementA implements Element {
  @Override
  public void accept(Visitor visitor) {
    visitor.visitConcreteElementA(this);
  }

  public String operationA() {
    return "ConcreteElementA operation";
  }
}
