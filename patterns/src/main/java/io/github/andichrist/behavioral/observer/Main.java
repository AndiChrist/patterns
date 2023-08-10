package io.github.andichrist.behavioral.observer;

/*
 Das "Beobachter"-Muster (Observer Pattern) ist ein Entwurfsmuster in der
 objektorientierten Programmierung und gehört zur Kategorie der Verhaltensmuster
 (Behavioral Pattern). Das Muster ermöglicht es, eine Abhängigkeit zwischen Objekten
 herzustellen, so dass Änderungen an einem Objekt automatisch an andere Objekte (die
 "Beobachter" genannt werden) weitergegeben werden, die dieses Objekt beobachten.

 Das "Beobachter"-Muster wird häufig verwendet, wenn es eine "eins zu viele"-Beziehung
 zwischen Objekten gibt. Wenn ein Objekt seinen Zustand ändert, müssen alle davon
 abhängigen Objekte darüber informiert und aktualisiert werden. Das Muster entkoppelt
 #die beobachteten Objekte von den beobachtenden Objekten und fördert somit die Flexibilität
 und Wiederverwendbarkeit.

 Die wichtigsten Komponenten des "Beobachter"-Musters sind:

 1. Beobachter (Observer): Ein Interface oder eine abstrakte Klasse, das/ die eine Update-
    Methode definiert, die aufgerufen wird, wenn sich der Zustand des beobachteten Objekts
    ändert.

 2. Konkreter Beobachter (Concrete Observer): Eine konkrete Implementierung des Beobachter-
    Interfaces, die die Update-Methode entsprechend implementiert.

 3. Subjekt (Subject): Ein Interface oder eine abstrakte Klasse, das/ die Methoden zum
    Hinzufügen, Entfernen und Benachrichtigen von Beobachtern definiert.

 4. Konkretes Subjekt (Concrete Subject): Eine konkrete Implementierung des Subjekt-
    Interfaces, das die Liste der Beobachter verwaltet und diese bei Zustandsänderungen
    benachrichtigt.

 Hier ist eine vereinfachte Implementierung des "Beobachter"-Musters in Java.

 Im Beispiel haben wir ein Interface Observer, das die Update-Methode definiert, die von
 den Beobachtern implementiert wird. Die konkrete Implementierung ConcreteObserver
 spezifiziert, wie die Update-Methode reagieren soll.

 Das Interface Subject definiert Methoden zum Hinzufügen, Entfernen und Benachrichtigen
 von Beobachtern. Die konkrete Implementierung ConcreteSubject verwaltet eine Liste von
 Beobachtern und benachrichtigt sie, wenn sich der Zustand ändert.

 Das "Beobachter"-Muster ermöglicht es uns, eine lose Kopplung zwischen beobachteten und
 beobachtenden Objekten zu erreichen. Die beobachteten Objekte müssen nicht über die
 Existenz der Beobachter Bescheid wissen, da sie nur das Beobachter-Interface kennen.
 Dadurch wird die Flexibilität und Wiederverwendbarkeit des Codes verbessert, da
 Beobachter leicht hinzugefügt oder entfernt werden können, ohne den beobachteten
 Objekten viel Aufmerksamkeit zu schenken.
 */
public class Main {
  public static void main(String[] args) {
    ConcreteSubject subject = new ConcreteSubject();

    Observer observer1 = new ConcreteObserver("Observer 1", subject);
    Observer observer2 = new ConcreteObserver("Observer 2", subject);

    subject.addObserver(observer1);
    subject.addObserver(observer2);

    subject.setState("New State");
    // Ausgabe:
    // Observer 1 received update: New State
    // Observer 2 received update: New State
  }
}

