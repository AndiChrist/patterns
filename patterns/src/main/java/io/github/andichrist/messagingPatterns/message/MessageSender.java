package io.github.andichrist.messagingPatterns.message;

// Sender
class MessageSender {
  private MessageReceiver receiver;

  public void setReceiver(MessageReceiver receiver) {
    this.receiver = receiver;
  }

  public void sendMessage(Message message) {
    System.out.println("Sender sends a message.");
    receiver.receiveMessage(message);
  }
}
