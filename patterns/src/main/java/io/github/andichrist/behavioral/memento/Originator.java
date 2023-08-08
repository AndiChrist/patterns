package io.github.andichrist.behavioral.memento;

// Der Ursprungator
public class Originator {
  private String state;

  public void setState(String state) {
    this.state = state;
  }

  public Memento saveToMemento() {
    return new Memento(state);
  }

  public void restoreFromMemento(Memento memento) {
    state = memento.getState();
  }

  public String getState() {
    return state;
  }
}
