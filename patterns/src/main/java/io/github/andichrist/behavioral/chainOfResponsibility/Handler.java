package io.github.andichrist.behavioral.chainOfResponsibility;

// Das Handler-Interface
public interface Handler {
  void handleRequest(Request request);
  void setNextHandler(Handler nextHandler);
}
