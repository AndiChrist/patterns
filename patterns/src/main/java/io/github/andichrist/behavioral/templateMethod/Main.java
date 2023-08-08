package io.github.andichrist.behavioral.templateMethod;

/*
 Die "Schablonenmethode" (Template Method) ist ein Entwurfsmuster in der objektorientierten
 Programmierung und gehört zur Kategorie der Verhaltensmuster (Behavioral Pattern). Das
 Muster definiert den Rahmen für einen Algorithmus in einer Methode und delegiert einige
 Schritte an Unterklassen. Die allgemeine Struktur des Algorithmus ist in der Oberklasse
 festgelegt, während spezifische Schritte oder Implementierungen in den Unterklassen
 bereitgestellt werden.

 Das Hauptziel der "Schablonenmethode" ist es, den Algorithmus in der Oberklasse zu kapseln,
 um eine Wiederverwendung und Flexibilität zu ermöglichen. Durch das Festlegen der Struktur
 in der Oberklasse können Unterklassen bestimmte Schritte überschreiben, um das Verhalten
 anzupassen, ohne jedoch den gesamten Algorithmus ändern zu müssen.

 Das Muster folgt dem Prinzip "Hollywood-Prinzip": "Don't call us, we'll call you." Das
 bedeutet, dass die Oberklasse den Ablauf kontrolliert und die Unterklassen an bestimmten
 Punkten im Algorithmus aufgerufen werden.

 Hier ist eine vereinfachte Implementierung der "Schablonenmethode" in Java.

 Im Beispiel haben wir eine abstrakte Klasse AbstractClass mit der Schablonenmethode
 templateMethod. Diese Methode definiert den Algorithmus und ruft allgemeine Schritte wie
 step1, step2 und optional step3 auf. Die abstrakten Methoden step1 und step2 müssen von
 den Unterklassen implementiert werden, während step3 optional ist und von den Unterklassen
 überschrieben werden kann.

 Die "Schablonenmethode" ist nützlich, um einen stabilen Algorithmus in der Oberklasse zu
 definieren und den spezifischen Teil in den Unterklassen zu erlauben. Dadurch wird die
 Wiederverwendung des Algorithmus gefördert, da die Unterklassen nur die für sie relevanten
 Schritte anpassen müssen. Dieses Muster wird oft in Frameworks und Bibliotheken verwendet,
 um eine allgemeine Struktur für Benutzer zu definieren und die Anpassung an spezifische
 Bedürfnisse zu ermöglichen.
 */
public class Main {
  public static void main(String[] args) {
    AbstractClass abstractClass = new ConcreteClass();
    abstractClass.templateMethod();
  }
}
