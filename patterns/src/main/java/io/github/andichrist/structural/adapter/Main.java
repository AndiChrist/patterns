package io.github.andichrist.structural.adapter;

/*
 Der "Adapter" ist ein Entwurfsmuster in der objektorientierten Programmierung und gehört
 zur Kategorie der Strukturmuster (Structural Pattern). Das Muster wird verwendet, um die
 Interaktion zwischen zwei unabhängigen oder inkompatiblen Schnittstellen zu ermöglichen,
 indem ein Adapter zwischen ihnen platziert wird.

 Der Adapter übersetzt die Anfragen einer Schnittstelle in Anfragen einer anderen
 Schnittstelle, sodass die beiden Schnittstellen zusammenarbeiten können, ohne dass eine
 Änderung an der ursprünglichen Implementierung erforderlich ist.

 Es gibt zwei Arten von Adaptern:

 1. Klassenadapter: Hier wird ein Adapter als eine abgeleitete Klasse erstellt, die sowohl
 das Ziel-Interface als auch das Adaptee (die zu adaptierende Klasse) erweitert. Durch das
 Erweitern des Adaptees erhält der Adapter Zugriff auf die Implementierung des Adaptees und
 kann die Anfragen der Ziel-Schnittstelle durch Anrufe an den Adaptee übersetzen.

 2. Objektadapter: Hier wird ein Adapter als eine separate Klasse erstellt, die sowohl das
 Ziel-Interface als auch eine Instanz des Adaptees enthält. Der Adapter delegiert die
 Anfragen der Ziel-Schnittstelle an die entsprechenden Methoden des Adaptees.

 Hier ist ein vereinfachtes Beispiel für einen Objektadapter in Java:

 Angenommen, wir haben ein bestehendes "Legacy"-Service, das eine Methode legacyRequest()
 bereitstellt, aber wir möchten eine neue Schnittstelle NewService verwenden, die eine
 Methode newRequest() bereitstellt. Der Adapter hilft dabei, die alten Funktionalitäten mit
 der neuen Schnittstelle zu verbinden.

 In diesem Beispiel wird der LegacyService über den LegacyServiceAdapter an die neue
 Schnittstelle NewService angepasst. Der Adapter LegacyServiceAdapter implementiert
 NewService und verwendet den LegacyService, um die Anfragen der neuen Schnittstelle an den
 Legacy-Service zu delegieren.

 Das Adapter-Muster erleichtert die Integration von bestehendem Code in neue Systeme und
 fördert die Wiederverwendung von vorhandenen Komponenten. Es ermöglicht auch die Verwendung
 von Klassen, die nicht kompatibel sind, in einer gemeinsamen Umgebung.
 */
public class Main {
  public static void main(String[] args) {
    LegacyService legacyService = new LegacyServiceImpl();
    NewService adapter = new LegacyServiceAdapter(legacyService);

    // Aufruf der neuen Schnittstelle, die den Adapter verwendet
    adapter.newRequest();
  }
}
