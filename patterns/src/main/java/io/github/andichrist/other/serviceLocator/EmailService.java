package io.github.andichrist.other.serviceLocator;

// Die konkrete Implementierung eines Messaging-Dienstes
public class EmailService implements MessagingService {
  @Override
  public void sendMessage(String message) {
    System.out.println("Sending Email: " + message);
  }
}