package io.github.andichrist.behavioral.memento;

/*
 Das "Memento"-Muster (Memento Pattern) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Verhaltensmuster (Behavioral Pattern). Das
 Muster wird verwendet, um den Zustand eines Objekts zu erfassen und als Memento zu
 speichern, um später zu einem früheren Zeitpunkt wiederhergestellt zu werden, ohne die
 Kapselung zu verletzen.

 Das Hauptziel des "Memento"-Musters besteht darin, den Zustand eines Objekts zu erfassen
 und zu speichern, ohne die internen Details des Objekts offenlegen zu müssen. Dadurch
 wird die Kapselung gewahrt und ermöglicht es, den Zustand eines Objekts in einem späteren
 Zeitpunkt wiederherzustellen.

 Die wichtigsten Komponenten des "Memento"-Musters sind:

 1. Ursprungator (Originator): Das Objekt, dessen Zustand gespeichert und wiederhergestellt
 werden soll. Es kann den aktuellen Zustand in einem Memento speichern und den Zustand aus
 einem Memento wiederherstellen.

 2. Memento (Memento): Ein Objekt, das den Zustand des Ursprungators repräsentiert. Es
 stellt ein Schnittstellen- oder Wertobjekt dar und bietet in der Regel keine Möglichkeit,
 den Zustand direkt zu ändern.

 3. Pfleger (Caretaker): Das Objekt, das die Mementos verwaltet. Es speichert die Mementos
 in einer Liste oder einem Stapel und stellt sie dem Ursprungator bei Bedarf zur Verfügung.

 Hier ist eine vereinfachte Implementierung des "Memento"-Musters in Java.

 Im Beispiel haben wir ein Memento-Objekt Memento, das den Zustand des Ursprungators
 repräsentiert. Der Ursprungator Originator kann den aktuellen Zustand in einem Memento
 speichern und den Zustand aus einem Memento wiederherstellen. Der Pfleger Caretaker
 verwaltet die Mementos und stellt sie dem Ursprungator bei Bedarf zur Verfügung.

 Das "Memento"-Muster ermöglicht es uns, den Zustand eines Objekts zu erfassen und
 wiederherzustellen, ohne die internen Details des Objekts offenzulegen. Es wird oft
 verwendet, um eine "Undo"-Funktionalität oder eine Möglichkeit zum Rollback von
 Änderungen zu implementieren. Es ist besonders nützlich, wenn Sie den Zustand eines
 Objekts speichern und später auf diesen Zustand zurückgreifen müssen, ohne die Struktur
 des Objekts selbst zu ändern.
 */
public class Main {
  public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();

    originator.setState("Zustand 1");
    caretaker.addMemento(originator.saveToMemento());

    originator.setState("Zustand 2");
    caretaker.addMemento(originator.saveToMemento());

    // Zustand wiederherstellen
    originator.restoreFromMemento(caretaker.getMemento(0));
    System.out.println("Aktueller Zustand: " + originator.getState());
    // Ausgabe: Aktueller Zustand: Zustand 1
  }
}
