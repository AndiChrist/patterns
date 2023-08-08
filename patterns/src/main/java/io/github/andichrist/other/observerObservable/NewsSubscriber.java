package io.github.andichrist.other.observerObservable;

// Die konkrete Implementierung des Observer
public class NewsSubscriber implements Observer {
  private String name;

  public NewsSubscriber(String name) {
    this.name = name;
  }

  @Override
  public void update(String message) {
    System.out.println(name + " received news: " + message);
  }
}
