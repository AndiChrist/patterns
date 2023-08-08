package io.github.andichrist.behavioral.visitor;

// Die konkrete Implementierung des Besuchers
public class ConcreteVisitor implements Visitor {
  @Override
  public void visitConcreteElementA(ConcreteElementA elementA) {
    System.out.println(elementA.operationA() + " visited by ConcreteVisitor");
  }

  @Override
  public void visitConcreteElementB(ConcreteElementB elementB) {
    System.out.println(elementB.operationB() + " visited by ConcreteVisitor");
  }
}
