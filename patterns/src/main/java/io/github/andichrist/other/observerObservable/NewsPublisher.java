package io.github.andichrist.other.observerObservable;

import java.util.ArrayList;
import java.util.List;

// Die konkrete Implementierung des Observable
public class NewsPublisher implements Observable {
  private List<Observer> observers = new ArrayList<>();

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers(String message) {
    for (Observer observer : observers) {
      observer.update(message);
    }
  }

  // Methode zum Veröffentlichen von Nachrichten
  public void publishNews(String news) {
    System.out.println("Publishing news: " + news);
    notifyObservers(news);
  }
}
