package io.github.andichrist.behavioral.interpreter;

/*
 Das "Interpreter"-Muster (Interpreter Pattern) ist ein Entwurfsmuster in der
 objektorientierten Programmierung und gehört zur Kategorie der Verhaltensmuster
 (Behavioral Pattern). Das Muster wird verwendet, um eine bestimmte Sprache oder Grammatik
 zu interpretieren und daraus eine spezifische Aktion abzuleiten.

 Das "Interpreter"-Muster wird häufig verwendet, um eine Domänensprache zu definieren und
 zu interpretieren. Es ist nützlich, wenn Sie komplexe Ausdrücke oder Regeln auswerten
 müssen, die in einer bestimmten Sprache ausgedrückt werden. Das Muster besteht aus zwei
 Hauptkomponenten:

 1. Kontext (Context): Enthält Informationen, die während der Interpretation von Ausdrücken
    verwendet werden können.

 2. Ausdruck (Expression): Definiert eine abstrakte Schnittstelle für die Interpretation
    eines bestimmten Ausdrucks oder einer Regel. Jede Implementierung des Ausdrucks kann
    die Interpretation in einer spezifischen Weise durchführen.

 Das "Interpreter"-Muster verwendet die Rekursion, um komplexe Ausdrücke in kleinere
 Teil-Ausdrücke aufzuteilen und diese schrittweise zu interpretieren.

 Hier ist eine vereinfachte Implementierung des "Interpreter"-Musters in Java.

 Angenommen, wir möchten einfache arithmetische Ausdrücke auswerten, die aus Addition und
 Subtraktion von Zahlen bestehen.

 Im Beispiel haben wir ein Interface Expression, das die abstrakte Schnittstelle für die
 Interpretation von Ausdrücken definiert. Die konkreten Ausdrücke AddExpression und
 SubtractExpression implementieren dieses Interface und führen die Interpretation der
 Ausdrücke für die Addition bzw. Subtraktion durch.

 Das "Interpreter"-Muster ermöglicht es uns, spezifische Grammatiken oder Sprachen zu
 interpretieren und daraus Ergebnisse abzuleiten. Es ist besonders nützlich, wenn Sie
 komplexe Ausdrücke oder Regeln auswerten müssen, die in einer speziellen Sprache
 ausgedrückt werden, wie z. B. mathematische Ausdrücke, Abfragen oder Regeln in einer
 Domänensprache.
 */
public class Main {
  public static void main(String[] args) {
    // Beispiel: 5 + (8 - 2)

    // Erstelle die Ausdrücke für die Zahlen
    Expression fiveExpression = new NumberExpression(5);
    Expression eightExpression = new NumberExpression(8);
    Expression twoExpression = new NumberExpression(2);

    // Erstelle die Ausdrücke für die Addition und Subtraktion
    Expression addExpression = new AddExpression(fiveExpression, new SubtractExpression(eightExpression, twoExpression));

    // Interpretiere den Ausdruck und erhalte das Ergebnis
    Context context = null; // Hier könnten Kontextinformationen übergeben werden
    int result = addExpression.interpret(context);
    System.out.println("Result: " + result);
    // Ausgabe:
    // Result: 11
  }
}

