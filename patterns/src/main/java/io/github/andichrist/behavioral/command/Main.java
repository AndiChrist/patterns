package io.github.andichrist.behavioral.command;

/*
 Das "Kommando"-Muster (Command Pattern) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Verhaltensmuster (Behavioral Pattern). Das
 Muster ermöglicht es, Aktionen oder Anfragen als eigenständige Objekte zu kapseln,
 wodurch Parameterisierung von Client-Anfragen und Undo-Operationen unterstützt werden.

 Das Hauptziel des "Kommando"-Musters besteht darin, die Anfrage eines Clients in ein
 separates Kommando-Objekt zu verpacken, das die erforderlichen Informationen enthält,
 um die Anfrage auszuführen. Dadurch wird der Client entkoppelt von den Objekten, die
 die Anfragen ausführen, und ermöglicht zusätzliche Flexibilität bei der Verwaltung,
 Parameterisierung und Protokollierung von Anfragen.

 Die wichtigsten Komponenten des "Kommando"-Musters sind:

 1. Kommando (Command): Ein Interface, das eine Methode (z. B. execute()) definiert, um
    die Aktion auszuführen.

 2. Konkretes Kommando (Concrete Command): Eine konkrete Implementierung des Kommandos,
    das die Methode execute() implementiert und eine Referenz auf den Empfänger enthält,
    der die eigentliche Aktion ausführt.

 3. Empfänger (Receiver): Das Objekt, das die eigentliche Aktion ausführt, wenn das
    Kommando ausgeführt wird.

 4. Aufrufer (Invoker): Der Client, der das Kommando erstellt und dessen execute()-Methode
    aufruft, um die Aktion auszuführen.

 Hier ist eine vereinfachte Implementierung des "Kommando"-Musters in Java.

 Im Beispiel haben wir ein Interface Command, das die Methode execute() definiert, um die
 Aktion auszuführen. Die konkrete Implementierung ConcreteCommand enthält eine Referenz
 auf den Empfänger Receiver, der die eigentliche Aktion ausführt.

 Der Empfänger Receiver führt die Aktion aus, wenn die execute()-Methode des Kommandos
 aufgerufen wird.

 Der Aufrufer Invoker erstellt das Kommando und ruft dessen execute()-Methode auf, um die
 Aktion auszuführen.

 Das "Kommando"-Muster ermöglicht es uns, Anfragen oder Aktionen als eigenständige Objekte
 zu kapseln, was zusätzliche Flexibilität und Funktionalität bietet. Es kann nützlich sein,
 wenn Sie eine "Undo"-Funktionalität implementieren möchten, die Möglichkeit zur
 Parameterisierung von Anfragen benötigen oder komplexe Anfrageverkettungen aufbauen
 möchten. Das Muster kann auch bei der Implementierung von Menüs, Buttons oder anderen
 Benutzerschnittstellen verwendet werden, bei denen Aktionen in Form von Kommandos
 behandelt werden sollen.
 */
public class Main {
  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Command command = new ConcreteCommand(receiver);
    Invoker invoker = new Invoker();

    invoker.setCommand(command);
    invoker.executeCommand();
    // Ausgabe:
    // Receiver: Action performed
  }
}
