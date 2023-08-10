package io.github.andichrist.structural.container;

/*
 Das "Container" Muster wird verwendet, um Objekte zu gruppieren und zu verwalten, um
 eine hierarchische Struktur zu erstellen.

 In diesem Beispiel gibt es eine Schnittstelle Component, die von sowohl den Blatt-Objekten
 (Leaf) als auch den Container-Objekten (Composite) implementiert wird. Die Leaf-Klasse
 stellt einzelne Elemente dar, während die Composite-Klasse eine Sammlung von Komponenten
 (sowohl Blättern als auch anderen Containern) repräsentiert.

 Die Composite-Klasse enthält eine Liste von Component-Objekten, die sie verwaltet. Sie
 implementiert die operation-Methode, die rekursiv die operation-Methode für alle
 enthaltenen Komponenten aufruft.

 Im Main-Programm wird eine hierarchische Struktur von Komponenten erstellt, und die
 operation-Methode wird auf dem obersten Container aufgerufen, um die hierarchischen
 Operationen auszuführen.

 Das "Container" Entwurfsmuster wird oft verwendet, um eine hierarchische Struktur von
 Objekten zu erstellen, die in einer Baumstruktur organisiert sind. Es ermöglicht die
 Behandlung von einzelnen Objekten und Gruppen von Objekten in der gleichen Weise und
 bietet eine Möglichkeit, komplexe Strukturen von Objekten zu organisieren und zu
 verwalten. Hier sind einige Anwendungsfälle und Szenarien, in denen das "Container"
 Entwurfsmuster nützlich sein kann:

 1. Benutzeroberfläche und GUI-Frameworks: In grafischen Benutzeroberflächen können
    Widgets, Steuerelemente und Layouts als Komponenten dargestellt werden. Container
    können Widgets gruppieren, um komplexe Benutzeroberflächen zu erstellen.

 2. Dateisysteme: In einem Dateisystem können Dateien und Verzeichnisse als Komponenten
    betrachtet werden. Verzeichnisse können wiederum Dateien oder weitere Verzeichnisse
    enthalten.

 3. Grafik- und Zeichenprogramme: Hierarchische Strukturen von Grafikobjekten wie
    Formen, Linien, Text usw. können mithilfe von Containern organisiert und verwaltet
    werden.

 4. Organisation von Ressourcen: In Spielen oder Anwendungen, die mit Ressourcen wie
    Bildern, Audio oder Videos arbeiten, kann das Container-Muster verwendet werden, um
    Ressourcen zu organisieren und zu verwalten.

 5. Untermenüs und Menüstrukturen: In Menüsystemen können Menüpunkte und Untermenüs als
    Komponenten betrachtet werden. Ein Untermenü kann sowohl Menüpunkte als auch weitere
    Untermenüs enthalten.

 6. Strukturierung von Daten: Wenn Daten in einer hierarchischen Struktur organisiert
    werden müssen, kann das "Container" Muster verwendet werden, um die Daten in
    verschiedenen Ebenen zu gruppieren und zu verwalten.

 Das "Container" Entwurfsmuster fördert die Trennung von Anliegen, da es die Verarbeitung
 von Einzelobjekten und Gruppen von Objekten auf gleiche Weise ermöglicht. Es erleichtert
 auch die Erweiterbarkeit und Wartbarkeit von Code, da neue Arten von Komponenten leicht
 hinzugefügt werden können, ohne bestehenden Code zu ändern.
 */
public class Main {
  public static void main(String[] args) {
    Component leaf1 = new Leaf("Leaf 1");
    Component leaf2 = new Leaf("Leaf 2");
    Component leaf3 = new Leaf("Leaf 3");

    Composite composite1 = new Composite();
    composite1.addComponent(leaf1);
    composite1.addComponent(leaf2);

    Composite composite2 = new Composite();
    composite2.addComponent(leaf3);

    Composite rootComposite = new Composite();
    rootComposite.addComponent(composite1);
    rootComposite.addComponent(composite2);

    rootComposite.operation();
  }
}
