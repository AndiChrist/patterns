package io.github.andichrist.other.observerObservable;

// Das Observable-Interface
public interface Observable {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers(String message);
}
