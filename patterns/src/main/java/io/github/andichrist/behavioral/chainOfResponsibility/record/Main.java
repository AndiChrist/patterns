package io.github.andichrist.behavioral.chainOfResponsibility.record;

public class Main {
  public static void main(String[] args) {
    Handler handler1 = new ConcreteHandler1();
    Handler handler2 = new ConcreteHandler2();

    handler1.setNextHandler(handler2);

    // Anfrage erstellen
    Request request = new Request("TypeA");

    // Die Anfrage durch die Kette leiten
    handler1.handleRequest(request);
    // Ausgabe (wenn ConcreteHandler1 und ConcreteHandler1: canHandle() return false)
    // No handler found for the request.
  }
}
