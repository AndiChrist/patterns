package io.github.andichrist.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

// Der Pfleger
public class Caretaker {
  private List<Memento> mementos = new ArrayList<>();

  public void addMemento(Memento memento) {
    mementos.add(memento);
  }

  public Memento getMemento(int index) {
    return mementos.get(index);
  }
}
