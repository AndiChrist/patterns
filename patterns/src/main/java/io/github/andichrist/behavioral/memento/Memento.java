package io.github.andichrist.behavioral.memento;

// Das Memento-Objekt
public class Memento {
  private final String state;

  public Memento(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
