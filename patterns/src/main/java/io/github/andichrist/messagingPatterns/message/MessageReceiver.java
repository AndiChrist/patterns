package io.github.andichrist.messagingPatterns.message;

// Empfänger
class MessageReceiver {
  public void receiveMessage(Message message) {
    System.out.println("Receiver receives a message.");
    message.process();
  }
}
