package io.github.andichrist.other.serviceLocator;

import java.util.HashMap;
import java.util.Map;

// Der Service Locator
public class ServiceLocator {
  private static final Map<String, MessagingService> services = new HashMap<>();

  // Dienste registrieren
  public static void registerService(String serviceName, MessagingService service) {
    services.put(serviceName, service);
  }

  // Dienste suchen und zurückgeben
  public static MessagingService getService(String serviceName) {
    return services.get(serviceName);
  }
}
