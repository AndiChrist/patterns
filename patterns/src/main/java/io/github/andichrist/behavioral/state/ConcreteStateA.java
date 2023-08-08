package io.github.andichrist.behavioral.state;

// Die konkrete Implementierung des Zustands
public class ConcreteStateA implements State {
  @Override
  public void doAction(Context context) {
    System.out.println("ConcreteStateA: Action A");
    context.setState(new ConcreteStateB());
  }
}
