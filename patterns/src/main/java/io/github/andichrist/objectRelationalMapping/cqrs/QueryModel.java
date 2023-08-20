package io.github.andichrist.objectRelationalMapping.cqrs;

// Abfrage-Modell
class QueryModel {
  public String getOrderDetails(int orderId) {
    // Lade Daten aus optimierter Datenstruktur für Abfragen
    return "Order details for order " + orderId;
  }
}
