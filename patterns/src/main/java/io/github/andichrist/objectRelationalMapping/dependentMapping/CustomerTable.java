package io.github.andichrist.objectRelationalMapping.dependentMapping;

import java.util.ArrayList;
import java.util.List;

// Klasse für die Tabelle "Customers"
class CustomerTable extends DatabaseTable {
  private List<Customer> customers = new ArrayList<>();

  @Override
  void fetch() {
    // Simuliere das Abrufen von Daten aus der Datenbank
    customers.add(new Customer(1, "Alice"));
    customers.add(new Customer(2, "Bob"));
    customers.add(new Customer(3, "Charlie"));
  }

  @Override
  void save() {
    // Simuliere das Speichern von Daten in der Datenbank
    System.out.println("Saving customer data to the database");
  }

  List<Customer> getCustomers() {
    return customers;
  }
}