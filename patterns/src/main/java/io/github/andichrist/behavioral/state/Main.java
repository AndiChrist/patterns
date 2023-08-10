package io.github.andichrist.behavioral.state;

/*
 Das "Zustand"-Muster (State Pattern) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Verhaltensmuster (Behavioral Pattern).
 Das Muster ermöglicht es einem Objekt, sein Verhalten zu ändern, wenn sich sein
 interner Zustand ändert, indem es den Zustand in separate Zustandsobjekte auslagert.

 Das Hauptziel des "Zustand"-Musters besteht darin, die Zustandsabhängigkeit aus der
 Hauptklasse zu entfernen und sie in separate Zustandsklassen zu verlagern. Dadurch
 wird das Verhalten des Objekts durch den aktuellen Zustand bestimmt, und das Objekt
 kann seinen Zustand zur Laufzeit ändern, ohne seine Schnittstelle zu ändern.

 Die wichtigsten Komponenten des "Zustand"-Musters sind:

 1. Kontext (Context): Das Objekt, dessen Zustand sich ändern kann. Es hält eine
    Referenz auf das aktuelle Zustandsobjekt und delegiert die Anfragen an das
    Zustandsobjekt.

 2. Zustand (State): Ein Interface oder eine abstrakte Klasse, das die Methoden
    definiert, die vom Kontext für verschiedene Zustände aufgerufen werden.

 3. Konkreter Zustand (Concrete State): Konkrete Implementierungen des Zustands-Interfaces,
    die das spezifische Verhalten für jeden Zustand definieren.

 Hier ist eine vereinfachte Implementierung des "Zustand"-Musters in Java.

 Im Beispiel haben wir ein Zustands-Interface State, das die Methode doAction() definiert,
 die vom Kontext aufgerufen wird. Die konkreten Zustände ConcreteStateA und ConcreteStateB
 implementieren dieses Interface und definieren das spezifische Verhalten für jeden
 Zustand. Wenn eine Aktion in einem Zustand ausgeführt wird, ändert sich der Zustand des
 Kontexts.

 Der Kontext Context hält eine Referenz auf das aktuelle Zustandsobjekt und ruft die
 Methoden des Zustandsobjekts auf, wenn eine Aktion ausgeführt wird. Das Zustandsobjekt
 selbst entscheidet, wie der Kontext auf die Aktion reagieren soll, und kann den Zustand
 des Kontexts ändern.

 Das "Zustand"-Muster ermöglicht es uns, das Verhalten eines Objekts auf verschiedene
 Zustände zu verteilen und den Zustand zur Laufzeit zu ändern. Es fördert die Flexibilität
 und ermöglicht es uns, den Zustandswechsel und das zustandsabhängige Verhalten zu
 zentralisieren und zu verwalten. Es ist besonders nützlich, wenn ein Objekt sein
 Verhalten ändern muss, basierend auf seinem internen Zustand, und Sie eine Lösung
 benötigen, die die Zustandsabhängigkeit von der Hauptklasse trennt.
 */
public class Main {
  public static void main(String[] args) {
    Context context = new Context();

    context.doAction();
    // Ausgabe: ConcreteStateA: Action A

    context.doAction();
    // Ausgabe: ConcreteStateB: Action B

    context.doAction();
    // Ausgabe: ConcreteStateA: Action A
  }
}
