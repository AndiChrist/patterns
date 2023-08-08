package io.github.andichrist.creational.builder;

/*
 Das "Builder"-Entwurfsmuster ist ein kreatives Erzeugungsmuster (Creational Pattern)
 in der objektorientierten Programmierung. Es wird verwendet, um die Erstellung von
 komplexen Objekten zu vereinfachen, indem es den Konstruktionsprozess schrittweise
 durchführt und die Anzahl der Konstruktorparameter reduziert. In Java wird das
 Builder-Muster in der Regel als eine statische innere Klasse in der Klasse des zu
 erstellenden Objekts implementiert.

 Hier ist ein Beispiel, um das Builder-Muster in Java zu illustrieren.

 Angenommen, wir möchten eine Klasse "Person" erstellen, die die Attribute "name", "age"
 und "address" hat, wobei "address" optional ist. Das Builder-Muster hilft uns, die
 Erstellung einer "Person"-Instanz zu vereinfachen.

 Im Beispiel wird die Person-Klasse mit einem Builder erstellt. Der Builder selbst
 akzeptiert die notwendigen Parameter (name und age) im Konstruktor und stellt eine Methode
 setAddress bereit, um die optionale Adresse festzulegen. Die Methode build wird verwendet,
 um die endgültige Person-Instanz zu erstellen.

 Das Builder-Muster macht den Code lesbarer, da die Erstellung von Objekten schrittweise
 erfolgt und die Anzahl der Konstruktorparameter begrenzt wird. Es ermöglicht auch die
 Erstellung von unveränderlichen (immutable) Objekten, da die "Person"-Klasse selbst keinen
 öffentlichen Konstruktor hat und ihre Attribute als final deklariert werden können.
 */
public class Main {
  public static void main(String[] args) {
    Person person1 = new Person.Builder("John", 30).setAddress("123 Main St").build();
    Person person2 = new Person.Builder("Alice", 25).build();

    System.out.println("person1 = " + person1);
    System.out.println("person2 = " + person2);
  }
}
