package io.github.andichrist.behavioral.visitor;

// Das Besucher-Interface
public interface Visitor {
  void visitConcreteElementA(ConcreteElementA elementA);
  void visitConcreteElementB(ConcreteElementB elementB);
}
