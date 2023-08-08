package io.github.andichrist.structural.decorator;

// Ein konkretes Dekorator, der Funktionalität hinzufügt
public class ConcreteDecoratorA implements Decorator {
  private Component component;

  public ConcreteDecoratorA(Component component) {
    this.component = component;
  }

  @Override
  public void operation() {
    System.out.println("Concrete Decorator A operation - Before");
    component.operation();
    System.out.println("Concrete Decorator A operation - After");
  }
}
