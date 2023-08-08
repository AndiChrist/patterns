package io.github.andichrist.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

// Die konkrete Implementierung des Subjekts
public class ConcreteSubject implements Subject {
  private List<Observer> observers = new ArrayList<>();
  private String state;

  public void setState(String state) {
    this.state = state;
    notifyObservers();
  }

  public String getState() {
    return state;
  }

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
}
