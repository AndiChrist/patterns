package io.github.andichrist.structural.flyweight;

/*
 Das "Fliegengewicht"-Muster (Flyweight Pattern) ist ein Entwurfsmuster in der
 objektorientierten Programmierung und gehört zur Kategorie der Strukturmuster
 (Structural Pattern). Das Muster wird verwendet, um die Speicher- und Leistungseffizienz
 zu verbessern, indem es den gemeinsamen Zustand (intrinsischen Zustand) von Objekten
 teilt, anstatt ihn in jedem Objekt zu duplizieren.

 Das "Fliegengewicht"-Muster wird in Situationen eingesetzt, in denen ein großer Satz von
 Objekten erstellt werden muss, die viele gemeinsame Eigenschaften haben. Anstatt jedes
 Objekt mit seinen eigenen Daten zu erstellen, wird der gemeinsame Teil in externe Objekte
 (Fliegengewichte) ausgelagert und kann von vielen anderen Objekten gemeinsam verwendet
 werden.

 Angenommen, wir haben eine Klasse Tree, die eine innere Zustandsdarstellung hat (z. B.
 Baumart, Farbe, Größe) und viele Bäume mit gleichen Eigenschaften erstellen möchte. Das
 "Fliegengewicht"-Muster ermöglicht es uns, den gemeinsamen Teil (z. B. Baumart) zu teilen
 und mehrere Bäume mit gleichen Eigenschaften zu erstellen.

 Im Beispiel haben wir ein Fliegengewicht-Interface TreeType, das den gemeinsamen Zustand
 repräsentiert. Die konkrete Implementierung ConcreteTreeType enthält die tatsächlichen
 Eigenschaften des Fliegengewichts. Die Klasse TreeInfo enthält den extrinsischen Zustand
 (d. h. die nicht geteilten Eigenschaften) der Bäume.

 Das "Fliegengewicht"-Muster ermöglicht es uns, eine große Anzahl von Bäumen mit gleichen
 Eigenschaften zu erstellen, indem wir das gemeinsame Fliegengewicht (TreeType) teilen und
 den extrinsischen Zustand (TreeInfo) speichern, der von den Bäumen nicht geteilt wird.
 Dadurch sparen wir Speicherplatz und verbessern die Leistung, da der gemeinsame Zustand
 nicht in jedem Baum dupliziert wird.
 */
public class Main {
  public static void main(String[] args) {
    TreeType oakType = new ConcreteTreeType("Oak", "Green");
    TreeType pineType = new ConcreteTreeType("Pine", "Green");

    TreeInfo tree1Info = new TreeInfo(10, 20);
    TreeInfo tree2Info = new TreeInfo(30, 40);

    // Erstelle zwei Bäume mit gleichen Eigenschaften (Fliegengewichte werden geteilt)
    oakType.display(tree1Info);
    pineType.display(tree2Info);
  }
}
