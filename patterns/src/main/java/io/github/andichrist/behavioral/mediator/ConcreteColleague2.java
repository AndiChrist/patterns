package io.github.andichrist.behavioral.mediator;

// Die konkrete Implementierung des Kollegen
public class ConcreteColleague2 implements Colleague {
  private Mediator mediator;

  public ConcreteColleague2(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void sendMessage(String message) {
    mediator.sendMessage(message, this);
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println("ConcreteColleague2 received: " + message);
  }
}
