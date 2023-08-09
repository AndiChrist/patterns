package io.github.andichrist.other.businessDelegate;

/*
 Das "Business Delegate" Muster ist ein strukturelles Entwurfsmuster, das dazu verwendet
 wird, die Kommunikation zwischen einer Client-Komponente und einer Business-Komponente
 zu entkoppeln. Es hilft, die Komplexität zu reduzieren und die Wiederverwendbarkeit und
 Wartbarkeit des Codes zu verbessern, indem es eine Zwischenschicht zwischen dem Client
 und der eigentlichen Geschäftskomponente bereitstellt.

 Hier ist eine kurze Erklärung des Musters:

 1. Client: Der Client ist die Komponente, die die Dienste der Business-Komponente nutzen
 möchte. Der Client interagiert nicht direkt mit der Business-Komponente, sondern verwendet
 stattdessen den "Business Delegate".

 2. Business Delegate: Der Business Delegate ist eine Zwischenschicht oder ein Vermittler,
 der die Interaktion des Clients mit der Business-Komponente verwaltet. Er versteckt die
 Komplexität der Business-Komponente und bietet eine einheitliche Schnittstelle für den
 Client.

 3. Lookup Service: Der Lookup Service ist für die Suche und Bereitstellung der richtigen
 Business-Komponente verantwortlich. Der Business Delegate verwendet den Lookup Service,
 um die entsprechende Business-Komponente zu erhalten.

 4. Business Service: Dies ist die eigentliche Geschäftskomponente, mit der der Client
 interagieren möchte. Der Business Delegate ruft Methoden auf der Business-Komponente auf,
 nachdem er sie über den Lookup Service erhalten hat.

 Das "Business Delegate" Muster ist besonders nützlich in Anwendungen mit verteilten
 Systemen, wo die Kommunikation mit entfernten Diensten oder Komponenten erfolgt. Es
 kann auch in Anwendungen eingesetzt werden, die Anfragen an verschiedene Dienste
 delegieren müssen, ohne sich um die Details der Dienstsuche oder -aufrufe kümmern
 zu müssen.

 In diesem Beispiel haben wir eine Business-Komponente mit zwei verschiedenen
 Implementierungen (EJBService und JMSService). Der Business Delegate (BusinessDelegate)
 entscheidet, welche Implementierung verwendet werden soll, und der Client (Client) ruft
 die Geschäftsfunktionalität über den Business Delegate auf, ohne sich um die Details
 der Business-Komponenten zu kümmern.
 */
// Beispielanwendung
public class BusinessDelegatePatternExample {
  public static void main(String[] args) {
    BusinessDelegate businessDelegate = new BusinessDelegate();
    businessDelegate.setServiceType("EJB");

    Client client = new Client(businessDelegate);
    client.doTask();

    businessDelegate.setServiceType("JMS");
    client.doTask();
  }
}
