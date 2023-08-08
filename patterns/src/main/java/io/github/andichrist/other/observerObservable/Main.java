package io.github.andichrist.other.observerObservable;

/*
 Das Observer-Observable-Muster, auch bekannt als Publish-Subscribe-Muster, ermöglicht die
 Definition einer Abhängigkeitsbeziehung zwischen Objekten, die informiert werden möchten
 (Observer), und dem Objekt, das die Informationen bereitstellt (Observable). Wenn der
 Observable-Zustand geändert wird, werden alle registrierten Observer darüber benachrichtigt
 und können entsprechend reagieren.

 Hier ist ein einfaches Java-Beispiel für das Observer-Observable-Muster.

 Im Beispiel haben wir das Observer-Observable-Muster implementiert, um ein einfaches
 System für das Veröffentlichen und Abonnieren von Nachrichten zu erstellen. Die Klasse
 NewsPublisher ist das Observable und die Klasse NewsSubscriber ist der Observer.

 Wenn die Methode publishNews() im NewsPublisher aufgerufen wird, werden alle registrierten
 Observer über die Nachricht informiert und die Methode update() in jedem Observer wird
 aufgerufen, um die Nachricht zu empfangen und anzuzeigen.

 Beim Ausführen des Codes sehen Sie, wie alle registrierten Observer über die
 veröffentlichten Nachrichten benachrichtigt werden. Wenn ein Observer von der Liste der
 Observer entfernt wird, wird er nicht mehr über neue Nachrichten informiert.
 */
public class Main {
  public static void main(String[] args) {
    // Observable erstellen
    NewsPublisher newsPublisher = new NewsPublisher();

    // Observer erstellen
    NewsSubscriber subscriber1 = new NewsSubscriber("Subscriber 1");
    NewsSubscriber subscriber2 = new NewsSubscriber("Subscriber 2");
    NewsSubscriber subscriber3 = new NewsSubscriber("Subscriber 3");

    // Observer dem Observable hinzufügen
    newsPublisher.addObserver(subscriber1);
    newsPublisher.addObserver(subscriber2);
    newsPublisher.addObserver(subscriber3);

    // Nachricht veröffentlichen (Alle Observer werden benachrichtigt)
    newsPublisher.publishNews("Breaking News: Important Announcement!");

    // Einen Observer entfernen (subscriber2 wird nicht mehr benachrichtigt)
    newsPublisher.removeObserver(subscriber2);

    // Nachricht erneut veröffentlichen (subscriber2 wird nicht benachrichtigt)
    newsPublisher.publishNews("Sports News: Team Wins Championship!");
  }
}
