package io.github.andichrist.objectRelationalMapping.unitOfWork;

/*
 Eine sinnvolle Definition eines "Domain Object" (auch "Domänenobjekt" genannt) ist,
 dass es sich um eine Klasse in einer Softwareanwendung handelt, die ein Konzept oder
 eine Entität aus dem realen Anwendungsdomänenmodell repräsentiert. Domänenobjekte erfassen
 die wesentlichen Eigenschaften, Zustände und Verhaltensweisen dieser Konzepte und
 ermöglichen es, die Geschäftslogik der Anwendung auf strukturierte und sinnvolle Weise
 zu modellieren.

 Hier sind einige charakteristische Merkmale von Domain Objects:

 1. Repräsentation der Domäne: Ein Domänenobjekt repräsentiert eine abstrakte Entität oder
 ein Konzept aus dem Geschäftsbereich der Anwendung. Dies kann beispielsweise ein Produkt,
 ein Kunde, eine Bestellung oder eine andere relevante Entität sein.

 2. Eigenschaften (Attribute): Domänenobjekte haben Eigenschaften, die die relevanten Daten
 für die jeweilige Entität speichern. Diese Eigenschaften können einfache Datentypen wie
 Zahlen oder Zeichenketten sein oder komplexe Datentypen wie andere Domänenobjekte.

 3. Verhalten (Methoden): Domänenobjekte können auch Verhaltensweisen oder Methoden haben,
 die die Geschäftslogik der Anwendung abbilden. Diese Methoden können verwendet werden, um
 Aktionen auf den Domänenobjekten auszuführen oder um relevante Berechnungen durchzuführen.

 4. Datenkapselung: Domänenobjekte verwenden Prinzipien der Datenkapselung, um den Zugriff
 auf ihre internen Daten zu kontrollieren und sicherzustellen, dass sie nur in sinnvoller
 Weise manipuliert werden können.

 5. Teil des Modells: Domänenobjekte sind Teil des Domänenmodells, das die strukturierte
 Darstellung der realen Welt in der Softwareanwendung beschreibt. Das Modell kann aus
 verschiedenen Domänenobjekten und deren Beziehungen bestehen.

 In vielen Softwareentwicklungsmustern, wie beispielsweise im "Domain-Driven Design" (DDD),
 spielen Domänenobjekte eine zentrale Rolle. Sie ermöglichen eine enge Abbildung der
 Geschäftslogik auf die Software und tragen dazu bei, die Komplexität zu reduzieren, den
 Code verständlicher zu machen und die Wartbarkeit der Anwendung zu verbessern.

 In diesem Beispiel repräsentiert die Klasse Product ein Produkt in einer Anwendung, das
 einen Namen, einen Preis und eine Menge hat. Die Klasse enthält einen Konstruktor, um die
 Eigenschaften beim Erstellen eines Produktobjekts festzulegen, sowie Getter- und Setter-
 Methoden, um auf die Eigenschaften zuzugreifen und sie zu aktualisieren. Die Methode
 calculateTotalPrice berechnet den Gesamtpreis des Produkts basierend auf dem Preis und
 der Menge.

 Dieses Domänenobjekt könnte Teil eines größeren Domänenmodells sein, das verschiedene
 Entitäten und ihre Beziehungen innerhalb der Anwendung repräsentiert.

 Es ist wichtig zu betonen, dass die genaue Implementierung eines Domänenobjekts stark von
 den Anforderungen und der Komplexität der Anwendung abhängt. Ein Domänenobjekt kann sowohl
 einfache als auch komplexe Eigenschaften und Methoden haben, um die spezifische
 Geschäftslogik der Anwendung zu unterstützen.
 */
// ein Domänenobjekt (Domain Object)
public class Product {
  private long id;
  private String name;
  private double price;
  private int quantity;

  // Konstruktor
  public Product(long id, String name, double price, int quantity) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
  }

  // Getter und Setter für die Eigenschaften

  // Methode zur Berechnung des Gesamtpreises
  public double calculateTotalPrice() {
    return price * quantity;
  }

  // Weitere Geschäftslogik und Methoden
}
