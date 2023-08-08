package io.github.andichrist.behavioral.visitor;

// Das Element-Interface
public interface Element {
  void accept(Visitor visitor);
}
