package io.github.andichrist.behavioral.chainOfResponsibility.record;

// Das Handler-Interface
public interface Handler {
  void handleRequest(Request request);
  void setNextHandler(Handler nextHandler);
}
