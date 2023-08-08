package io.github.andichrist.behavioral.state;

// Der Kontext
public class Context {
  private State state;

  public Context() {
    state = new ConcreteStateA(); // Startzustand setzen
  }

  public void setState(State state) {
    this.state = state;
  }

  public void doAction() {
    state.doAction(this);
  }
}
