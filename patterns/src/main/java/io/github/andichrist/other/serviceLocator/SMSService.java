package io.github.andichrist.other.serviceLocator;

// Die konkrete Implementierung eines Messaging-Dienstes
public class SMSService implements MessagingService {
  @Override
  public void sendMessage(String message) {
    System.out.println("Sending SMS: " + message);
  }
}