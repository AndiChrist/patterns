package io.github.andichrist.other.serviceLocator;

/*
 Das Service Locator-Muster ist ein Entwurfsmuster, das verwendet wird, um die
 Lokalisierung und den Zugriff auf verschiedene Dienste (Services) in einer Anwendung
 zu zentralisieren. Es vermeidet die direkte Abhängigkeit von Client-Klassen von den
 konkreten Implementierungen der Dienste und ermöglicht es, Dienste zur Laufzeit zu
 finden und aufzurufen.

 Hier ist ein einfaches Java-Beispiel für das Service Locator-Muster.

 Im Beispiel haben wir das Service Locator-Muster implementiert, um die Lokalisierung und
 den Zugriff auf verschiedene Messaging-Dienste zu zentralisieren. Der Service Locator
 verwaltet die konkreten Implementierungen der Messaging-Dienste und ermöglicht es, diese
 zur Laufzeit abzurufen, ohne dass die Client-Klassen die genauen Implementierungen kennen
 müssen.

 Das Service Locator-Muster bietet eine zentrale Stelle für die Verwaltung der Dienste
 und reduziert die direkte Abhängigkeit von Client-Klassen von den Diensten. Dadurch wird
 der Code flexibler und ermöglicht es, die Dienste einfach auszutauschen oder zu erweitern,
 ohne die Client-Klassen ändern zu müssen. Es erleichtert auch das Testen, da Sie Dummy-
 Dienste erstellen und in den Service Locator einfügen können, um Tests durchzuführen, ohne
 die tatsächlichen Dienste zu verwenden.
 */
public class Main {
  public static void main(String[] args) {
    // Dienste im Service Locator registrieren
    ServiceLocator.registerService("emailService", new EmailService());
    ServiceLocator.registerService("smsService", new SMSService());

    // Dienste über den Service Locator abrufen und verwenden
    MessagingService emailService = ServiceLocator.getService("emailService");
    emailService.sendMessage("Hello, this is an email message.");

    MessagingService smsService = ServiceLocator.getService("smsService");
    smsService.sendMessage("Hello, this is an SMS message.");
  }
}
