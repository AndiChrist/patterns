package io.github.andichrist.objectRelationalMapping.dependentMapping;

import java.util.ArrayList;
import java.util.List;

/*
 Das "Dependent Mapping" Muster, das auch als "Table Module" Muster bekannt ist, behandelt die
 Organisation von Klassen und Datenbanktabellen. Es zielt darauf ab, die Struktur einer
 Datenbanktabelle mit einer spezifischen Klasse in der Anwendung zu verbinden. Jede Instanz dieser
 Klasse repräsentiert eine Zeile in der Tabelle, und die Klassenmethoden bieten Funktionen zum
 Abfragen, Aktualisieren und Verwalten von Daten.

 In diesem Beispiel simulieren wir das "Dependent Mapping" Muster. CustomerTable repräsentiert die
 Datenbanktabelle für Kunden. Customer ist die Klasse, die eine Zeile in der Tabelle darstellt. Sie
 können Kundeninformationen abrufen, aktualisieren und speichern.

 Bitte beachten Sie, dass dies ein einfaches Beispiel ist, um das Konzept des "Dependent Mapping"
 Musters zu veranschaulichen. In komplexen Anwendungen würden Sie wahrscheinlich ORM-Frameworks
 (Object-Relational Mapping) oder andere Datenbankzugriffsmethoden verwenden, um die Abstraktion von
 Datenbanktabellen zu vereinfachen.
 */
public class DependentMappingPatternExample {
  public static void main(String[] args) {
    CustomerTable customerTable = new CustomerTable();
    customerTable.fetch();

    List<Customer> customers = customerTable.getCustomers();

    for (Customer customer : customers) {
      System.out.println("Customer ID: " + customer.id() + ", Name: " + customer.name());
    }

    // Änderungen an Kundeninformationen
    List<Customer> updatedCustomers = new ArrayList<>(customers);
    Customer firstCustomer = updatedCustomers.get(0);
    updatedCustomers.remove(firstCustomer);

    Customer updatedCustomer = new Customer(firstCustomer.id(), "Alicia"); // replacing "Alice"
    updatedCustomers.add(updatedCustomer);

    // Speichern der geänderten Daten
    customerTable.save();

    for (Customer customer : updatedCustomers) {
      System.out.println("Customer ID: " + customer.id() + ", Name: " + customer.name());
    }
  }
}