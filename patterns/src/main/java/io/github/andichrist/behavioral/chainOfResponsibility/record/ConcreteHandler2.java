package io.github.andichrist.behavioral.chainOfResponsibility.record;

// Die konkrete Implementierung des Handlers
public class ConcreteHandler2 implements Handler {
  private Handler nextHandler;

  @Override
  public void setNextHandler(Handler nextHandler) {
    this.nextHandler = nextHandler;
  }

  @Override
  public void handleRequest(Request request) {
    if (canHandle(request)) {
      System.out.println("ConcreteHandler2 handles the request.");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(request);
    } else {
      System.out.println("No handler found for the request.");
    }
  }

  private boolean canHandle(Request request) {
    // Überprüfen, ob dieser Handler die Anfrage bearbeiten kann
    // und entsprechende Bedingungen prüfen.
    return false;
  }
}
