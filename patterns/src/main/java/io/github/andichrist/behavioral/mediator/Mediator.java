package io.github.andichrist.behavioral.mediator;

// Das Vermittler-Interface
public interface Mediator {
  void sendMessage(String message, Colleague colleague);
}
