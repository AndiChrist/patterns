package io.github.andichrist.messagingPatterns.message;

/*
 Das "Message" Muster ist ein Entwurfsmuster, das sich auf die Kommunikation zwischen
 Komponenten oder Systemen in einer Anwendung oder einem System konzentriert. Es beschreibt,
 wie Nachrichten zwischen verschiedenen Teilen einer Software übermittelt werden, um
 Informationen auszutauschen, Aktionen auszulösen oder Statusänderungen zu signalisieren.

 Das "Message" Muster betont die lose Kopplung zwischen den beteiligten Komponenten, indem es
 die direkte Abhängigkeit der Komponenten voneinander verringert. Anstatt direkt miteinander
 zu interagieren, senden Komponenten Nachrichten, um miteinander zu kommunizieren. Dies
 erleichtert die Wartbarkeit, Erweiterbarkeit und Testbarkeit von Anwendungen, da Änderungen
 in einer Komponente nicht unbedingt Änderungen in allen anderen Komponenten erfordern.

 Hier sind einige wichtige Konzepte des "Message" Musters:

 1. Nachrichten: Dies sind strukturierte Datenpakete, die Informationen zwischen Komponenten
     übermitteln. Nachrichten können Parameter, Befehle, Zustandsinformationen oder andere
     relevante Daten enthalten.

 2. Sender: Die Komponente, die die Nachricht sendet.

 3. Empfänger: Die Komponente, die die Nachricht empfängt und darauf reagiert.

 4. Nachrichtenvermittlung: Der Mechanismus, der Nachrichten zwischen den Sendern und
    Empfängern weiterleitet. Dies kann synchron oder asynchron sein und verschiedene
    Kommunikationsprotokolle verwenden.

 5. Entkopplung: Durch die Verwendung von Nachrichten wird die Abhängigkeit zwischen Sendern
    und Empfängern reduziert, was zu einer lockereren Kopplung und einer leichteren Wartbarkeit
    führt.

 Das "Message" Muster kann in verschiedenen Formen auftreten, einschließlich ereignisbasierter
 Kommunikation, Nachrichtenwarteschlangen, Publish-Subscribe-Systemen und mehr. Es wird oft in
 Anwendungen mit mehreren Komponenten, Mikroservices-Architekturen und asynchronen
 Verarbeitungsanforderungen eingesetzt.

 In diesem Beispiel verwenden wir das Konzept der Nachrichtenübermittlung zwischen einem
 Sender und einem Empfänger mithilfe von Java-Interfaces.

 In diesem Beispiel haben wir eine Nachrichtenschnittstelle Message, die von konkreten
 Nachrichtenklassen wie GreetingMessage und WarningMessage implementiert wird. Der
 MessageSender sendet Nachrichten an den MessageReceiver, der die Nachrichten empfängt und
 verarbeitet. Das "Message" Muster ermöglicht es, dass der Sender und Empfänger unabhängig
 voneinander existieren können und keine direkte Abhängigkeit besteht.

 Bitte beachten Sie, dass dies ein einfaches Beispiel ist, um das Konzept des "Message"
 Musters zu verdeutlichen. In komplexeren Anwendungen könnten Sie Frameworks oder Bibliotheken
 verwenden, die erweiterte Nachrichtenübermittlungsfunktionen bieten, insbesondere in verteilten
 Systemen oder Mikroservice-Architekturen.
 */
public class MessagePatternExample {
  public static void main(String[] args) {
    MessageSender sender = new MessageSender();
    MessageReceiver receiver = new MessageReceiver();

    sender.setReceiver(receiver);

    Message greetingMessage = new GreetingMessage();
    Message warningMessage = new WarningMessage();

    sender.sendMessage(greetingMessage);
    sender.sendMessage(warningMessage);
  }
}
