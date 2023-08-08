package io.github.andichrist.behavioral.observer;

// Das Interface für das Subjekt
public interface Subject {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObservers();
}
