package io.github.andichrist.behavioral.chainOfResponsibility;

/*
 Die "Zuständigkeitskette" (Chain of Responsibility) ist ein Entwurfsmuster in der
 objektorientierten Programmierung und gehört zur Kategorie der Verhaltensmuster
 (Behavioral Pattern). Das Muster ermöglicht es, eine Anfrage entlang einer Kette von
 potenziellen Empfängern zu leiten, wobei jeder Empfänger die Möglichkeit hat, die
 Anfrage zu bearbeiten oder sie an den nächsten Empfänger in der Kette weiterzuleiten.

 Das Hauptziel der "Zuständigkeitskette" besteht darin, eine flexible und lose Kopplung
 zwischen dem Absender einer Anfrage und dem Empfänger zu ermöglichen. Anstatt den
 Absender direkt an einen bestimmten Empfänger zu binden, wird die Anfrage durch eine
 Kette von Empfängern geleitet, die selbst entscheiden können, ob sie die Anfrage
 bearbeiten oder an den nächsten Empfänger in der Kette weitergeben möchten.

 Die wichtigsten Komponenten der "Zuständigkeitskette" sind:

 1. Handler (Handler): Ein Interface oder eine abstrakte Klasse, das die Methode
    handleRequest() definiert, um die Anfrage zu bearbeiten oder an den nächsten Handler
    in der Kette weiterzuleiten.

 2. Konkreter Handler (Concrete Handler): Konkrete Implementierungen des Handlers, die
    die Anfrage bearbeiten können. Jeder konkrete Handler kann entscheiden, ob er die
    Anfrage selbst bearbeiten kann oder sie an den nächsten Handler weitergibt.

 Hier ist eine vereinfachte Implementierung der "Zuständigkeitskette" in Java.

 Im Beispiel haben wir ein Handler-Interface Handler, das die Methode handleRequest()
 definiert, um die Anfrage zu bearbeiten oder an den nächsten Handler in der Kette
 weiterzuleiten. Die konkreten Handler ConcreteHandler1 und ConcreteHandler2 implementieren
 dieses Interface und können die Anfrage bearbeiten oder sie an den nächsten Handler
 weitergeben.

 Jeder Handler hat eine Referenz auf den nächsten Handler in der Kette und kann
 entscheiden, ob er die Anfrage selbst bearbeiten kann oder sie an den nächsten
 Handler weiterleitet.

 Die Anfrage Request wird durch die Kette von Handlern geleitet, bis ein passender
 Handler gefunden wird, der die Anfrage bearbeiten kann. Wenn keiner der Handler die
 Anfrage bearbeiten kann, wird eine entsprechende Meldung ausgegeben.

 Die "Zuständigkeitskette" ermöglicht es uns, die Verarbeitung von Anfragen flexibel zu
 gestalten und die Abhängigkeiten zwischen dem Absender und dem Empfänger zu reduzieren.
 Es ist besonders nützlich, wenn Sie mehrere Objekte haben, die eine bestimmte Anfrage
 bearbeiten können, und Sie nicht möchten, dass der Absender von der genauen Struktur
 der Empfänger weiß. Dadurch können Sie die Empfänger leicht austauschen oder hinzufügen,
 ohne den Code des Absenders ändern zu müssen.
 */
public class Main {
  public static void main(String[] args) {
    Handler handler1 = new ConcreteHandler1();
    Handler handler2 = new ConcreteHandler2();

    handler1.setNextHandler(handler2);

    // Anfrage erstellen
    Request request = new Request("TypeA");

    // Die Anfrage durch die Kette leiten
    handler1.handleRequest(request);
    // Ausgabe (wenn ConcreteHandler1 und ConcreteHandler1: canHandle() return false)
    // No handler found for the request.
  }
}
