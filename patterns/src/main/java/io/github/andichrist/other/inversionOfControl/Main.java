package io.github.andichrist.other.inversionOfControl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 Inversion of Control (IoC) Container ist ein Konzept oder Framework, das das Dependency
 Injection (DI) Muster verwendet, um die Verwaltung von Abhängigkeiten zu automatisieren.
 Ein bekanntes Java-Framework für IoC-Container ist "Spring Framework". Hier ist ein
 einfaches Beispiel mit Spring, um zu veranschaulichen, wie ein IoC-Container verwendet
 wird.

 @see: resources/applicationContext.xml
 */
public class Main {
  public static void main(String[] args) {
    // IoC-Container initialisieren
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    // Application-Bean aus dem Container abrufen
    Application application = context.getBean("application", Application.class);

    // Anwendung ausführen
    application.doSomething();
  }
}
