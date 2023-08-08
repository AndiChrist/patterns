package io.github.andichrist.behavioral.state;

// Die konkrete Implementierung des Zustands
public class ConcreteStateB implements State {
  @Override
  public void doAction(Context context) {
    System.out.println("ConcreteStateB: Action B");
    context.setState(new ConcreteStateA());
  }
}
