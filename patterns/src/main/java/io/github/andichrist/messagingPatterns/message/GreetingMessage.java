package io.github.andichrist.messagingPatterns.message;

// Konkrete Nachrichtenklasse
class GreetingMessage implements Message {
  @Override
  public void process() {
    System.out.println("Hello, world!");
  }
}
