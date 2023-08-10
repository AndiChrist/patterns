package io.github.andichrist.creational.singleton;

/*
 Das Singleton-Muster ist ein Entwurfsmuster in der objektorientierten Programmierung und
 gehört zur Kategorie der kreativen Erzeugungsmuster (Creational Pattern). Es wird verwendet,
 um sicherzustellen, dass eine Klasse nur eine einzige Instanz hat und bietet einen globalen
 Zugriffspunkt auf diese Instanz.

 Das Singleton-Muster wird in Szenarien eingesetzt, in denen es notwendig ist, dass genau
 eine Instanz einer Klasse existiert, und dass diese Instanz von verschiedenen Teilen des
 Programms aus zugänglich sein soll.

 Erklärung:

 1. Die Klasse Singleton hat einen privaten statischen Member instance, der die einzige
    Instanz der Klasse hält. Er wird als statisch deklariert, damit er unabhängig von einer
    Instanz der Klasse existiert.

 2. Der Konstruktor der Singleton-Klasse ist privat, was bedeutet, dass keine Instanzen der
    Klasse außerhalb der Klasse erstellt werden können.

 3. Die statische Methode getInstance ist der zentrale Zugriffspunkt, um die Singleton-Instanz
    zurückzugeben. Wenn instance noch nicht initialisiert ist, wird sie durch den Aufruf des
    privaten Konstruktors erstellt.

 Wichtig: Die obige Implementierung ist bekannt als "Lazy Initialization". Das bedeutet, dass
 die Singleton-Instanz erst beim ersten Aufruf von getInstance() erstellt wird. Es ist eine
 einfache Methode, die Ressourcen spart, wenn die Singleton-Instanz möglicherweise nicht
 benötigt wird.

 Es gibt auch andere Varianten des Singleton-Musters, wie zum Beispiel die "Eager
 Initialization" (sofortige Initialisierung) oder die "Thread-Safe Lazy Initialization"
 (synchronisierte Initialisierung, um Thread-Sicherheit zu gewährleisten).

 Die Verwendung des Singleton-Musters sollte jedoch vorsichtig betrachtet werden, da es zu
 globalen Zugriffspunkten führt, die die Testbarkeit und die Trennung von Zuständigkeiten
 erschweren können. In einigen Fällen kann das Singleton-Muster durch Dependency Injection
 oder andere Entwurfsmuster ersetzt oder vermieden werden.
 */
public class Singleton {
  private static Singleton instance;

  // Private Konstruktor, um die Instanziierung von außerhalb der Klasse zu verhindern
  private Singleton() {
    // Initialisierungscode (optional)
  }

  // Statische Methode, um die Singleton-Instanz zurückzugeben
  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  // Weitere Methoden und Eigenschaften der Singleton-Klasse
}
