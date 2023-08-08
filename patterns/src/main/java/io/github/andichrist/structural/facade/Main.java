package io.github.andichrist.structural.facade;

/*
 Das "Fassade"-Muster (Facade Pattern) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Strukturmuster (Structural Pattern). Das
 Muster bietet eine einheitliche Schnittstelle, um eine komplexere Unternehmenslogik oder
 Subsysteme zu vereinfachen und zu kapseln. Es fungiert als vereinfachte Schnittstelle zu
 einem größeren Satz von Klassen, um die Verwendung und den Zugriff auf diese Klassen zu
 erleichtern.

 Die Fassade versteckt die Komplexität des Subsystems, indem sie eine einfachere
 Schnittstelle bereitstellt, die häufig genutzte Funktionen oder Aktionen bündelt und
 zusammenfasst. Dadurch wird die Interaktion mit dem Subsystem für den Client deutlich
 einfacher, da er nur mit der Fassade kommuniziert, ohne sich um die darunterliegenden
 Details kümmern zu müssen.

 Das "Fassade"-Muster ist nützlich, wenn ein komplexes Subsystem eine Vielzahl von Klassen
 und Interaktionen hat, die für den Client schwer zu verstehen oder zu nutzen sind. Die
 Fassade bietet eine Abstraktionsebene und ermöglicht es dem Client, auf eine einfachere
 Schnittstelle zuzugreifen, ohne mit den internen Details des Subsystems vertraut sein zu
 müssen.

 Im Beispiel haben wir eine Fassade (Facade), die eine vereinfachte Schnittstelle
 (simplifiedOperation) zum komplexen Subsystem bereitstellt. Der Client kann die Fassade
 verwenden, um die gewünschten Funktionen aufzurufen, ohne sich um die internen Details des
 Subsystems kümmern zu müssen.

 Das "Fassade"-Muster hilft, den Code des Clients zu vereinfachen und macht ihn weniger
 anfällig für Änderungen im Subsystem, da die Interaktion nur über die Fassade erfolgt. Es
 fördert auch die Wiederverwendung, da verschiedene Clients dieselbe Fassade verwenden
 können, um auf das Subsystem zuzugreifen.
 */
public class Main {
  public static void main(String[] args) {
    Facade facade = new Facade();
    facade.simplifiedOperation();
    // Ausgabe:
    // Subsystem A operation
    // Subsystem B operation
  }
}
