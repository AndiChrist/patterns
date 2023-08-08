package io.github.andichrist.structural.decorator;

// Ein weiteres konkretes Dekorator, der weitere Funktionalität hinzufügt
public class ConcreteDecoratorB implements Decorator {
  private Component component;

  public ConcreteDecoratorB(Component component) {
    this.component = component;
  }

  @Override
  public void operation() {
    System.out.println("Concrete Decorator B operation - Before");
    component.operation();
    System.out.println("Concrete Decorator B operation - After");
  }
}
