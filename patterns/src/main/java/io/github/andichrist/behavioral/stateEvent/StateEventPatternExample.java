package io.github.andichrist.behavioral.stateEvent;

/*
 Das "State/Event" Pattern verwendet Zustandsübergänge und Ereignisse, um das Verhalten
 eines Objekts in verschiedenen Zuständen zu modellieren. Hier sind die Hauptkomponenten
 des Musters:

 1. Zustände: Definieren Sie die verschiedenen Zustände, in denen sich ein Objekt
    befinden kann. Jeder Zustand ist normalerweise eine eigene Klasse, die das Verhalten
    des Objekts in diesem Zustand definiert.

 2. Ereignisse: Definieren Sie die Ereignisse, die den Zustandsübergang auslösen.
    Ereignisse sind normalerweise ebenfalls eigene Klassen oder Enumerationen.

 3. Zustandsübergänge: Definieren Sie, wie das Objekt von einem Zustand in einen
    anderen wechselt, wenn bestimmte Ereignisse auftreten. Dies kann durch Methoden
    oder Verwaltung von Zustandseigenschaften erreicht werden.

 4. Kontext oder Zustandsautomat: Dies ist das Objekt, dessen Verhalten auf der
    Grundlage des aktuellen Zustands und der eingehenden Ereignisse gesteuert wird.

 In diesem Beispiel haben wir zwei Zustände (StateA und StateB), zwei Ereignisse
 (EventX und EventY) und einen Kontext (Context), der den Zustandsautomaten verwaltet.
 Der Zustand des Kontexts ändert sich basierend auf den eingehenden Ereignissen.
 */
public class StateEventPatternExample {
  public static void main(String[] args) {
    Context context = new Context();
    context.handleEvent(new EventX());
    context.handleEvent(new EventY());
  }
}
