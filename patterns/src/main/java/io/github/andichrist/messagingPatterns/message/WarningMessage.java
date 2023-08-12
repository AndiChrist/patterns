package io.github.andichrist.messagingPatterns.message;

// Konkrete Nachrichtenklasse
class WarningMessage implements Message {
  @Override
  public void process() {
    System.out.println("This is a warning message.");
  }
}
