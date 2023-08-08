package io.github.andichrist.behavioral.observer;


// Die konkrete Implementierung des Beobachters
public class ConcreteObserver implements Observer {
  private String name;
  private ConcreteSubject subject;

  public ConcreteObserver(String name, ConcreteSubject subject) {
    this.name = name;
    this.subject = subject;
  }

  @Override
  public void update() {
    String message = subject.getState();
    System.out.println(name + " received update: " + message);
  }
}
