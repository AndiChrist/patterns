package io.github.andichrist.creational.multiton;

/*
 Das "Multiton" Entwurfsmuster ist eine Variante des "Singleton" Entwurfsmusters, bei dem
 es eine begrenzte Anzahl von Instanzen einer Klasse gibt, die jeweils durch einen
 eindeutigen Schlüssel identifiziert werden.

 Hier ist ein Beispiel für das "Multiton" Entwurfsmuster in Java.

 In diesem Beispiel gibt es eine Klasse namens Multiton, die über eine private statische
 Map von Instanzen und einen privaten Konstruktor verfügt. Die Methode getInstance
 überprüft, ob bereits eine Instanz mit dem gegebenen Namen existiert, und gibt sie
 zurück, falls vorhanden, oder erstellt eine neue Instanz und speichert sie in der Map.
 Dadurch wird sichergestellt, dass pro Name nur eine Instanz existiert. In der main-
 Methode des Main-Programms wird die Verwendung des "Multiton" Entwurfsmusters
 demonstriert, indem mehrere Instanzen mit verschiedenen und gleichen Namen abgerufen
 werden.
 */
public class Main {
  public static void main(String[] args) {
    Multiton instance1 = Multiton.getInstance("Instance1");
    Multiton instance2 = Multiton.getInstance("Instance2");
    Multiton instance3 = Multiton.getInstance("Instance1");

    System.out.println(instance1.getName()); // Output: Instance1
    System.out.println(instance2.getName()); // Output: Instance2
    System.out.println(instance3.getName()); // Output: Instance1

    System.out.println(instance1 == instance2); // Output: false
    System.out.println(instance1 == instance3); // Output: true
  }
}
