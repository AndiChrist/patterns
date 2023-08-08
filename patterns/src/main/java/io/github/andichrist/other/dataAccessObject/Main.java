package io.github.andichrist.other.dataAccessObject;

import java.util.List;

/*
 Das Data Access Object (DAO) Muster ist eng mit dem Repository-Muster verwandt und dient
 ebenfalls dazu, die Datenzugriffslogik zu kapseln. Es ermöglicht den Zugriff auf Daten
 in einer Datenquelle, z. B. einer Datenbank, ohne dass der Rest der Anwendung die genaue
 Implementierung des Datenzugriffs kennt. DAOs bieten eine Abstraktionsschicht zwischen
 der Anwendungslogik und der Datenbank.

 Hier ist ein einfaches Java-Beispiel für das Data Access Object (DAO) Muster.

 Im Beispiel haben wir das Data Access Object (DAO) Muster implementiert, um eine einfache
 Datenquelle (eine Liste im Speicher) zu verwenden. Wie beim Repository-Muster können
 Sie die konkrete Implementierung des DAOs leicht ändern, um eine echte Datenbank oder
 einen anderen Speichermechanismus zu verwenden, ohne den Code der Main-Klasse ändern
 zu müssen.

 Das DAO-Muster bietet eine Abstraktion für den Datenzugriff und erleichtert die Trennung
 der Datenzugriffslogik von der Geschäftslogik der Anwendung. Es macht den Code wartbarer
 und erleichtert auch die Durchführung von Unit-Tests, da die Datenzugriffslogik von der
 restlichen Anwendung entkoppelt ist.
 */
public class Main {
  public static void main(String[] args) {
    ProductDAO productDAO = new InMemoryProductDAO();

    Product product1 = new Product();
    product1.setName("Laptop");
    product1.setPrice(1000.0);
    productDAO.save(product1);

    Product product2 = new Product();
    product2.setName("Smartphone");
    product2.setPrice(500.0);
    productDAO.save(product2);

    // Produkte ausgeben
    List<Product> allProducts = productDAO.findAll();
    for (Product product : allProducts) {
      System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
    }

    // Ein Produkt aktualisieren
    Product productToUpdate = productDAO.findById(1);
    if (productToUpdate != null) {
      productToUpdate.setName("Updated Laptop");
      productToUpdate.setPrice(1200.0);
      productDAO.update(productToUpdate);
    }

    // Produkte nach dem Update ausgeben
    allProducts = productDAO.findAll();
    for (Product product : allProducts) {
      System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Price: " + product.getPrice());
    }
  }
}
