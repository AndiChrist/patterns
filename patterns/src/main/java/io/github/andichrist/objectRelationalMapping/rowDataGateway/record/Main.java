package io.github.andichrist.objectRelationalMapping.rowDataGateway.record;

public class Main {
  public static void main(String[] args) {
    Produkt produkt = ProduktGateway.getProduktByID(1);
    if (produkt != null) {
      System.out.println("Produktname: " + produkt.name());
      System.out.println("Produktpreis: " + produkt.preis());

      Produkt updatedProdukt = new Produkt(produkt.id(), "Neuer Produktname", 29.99);
      ProduktGateway.updateProdukt(updatedProdukt);

      System.out.println("Aktualisierter Produktname: " + updatedProdukt.name());
      System.out.println("Aktualisierter Produktpreis: " + updatedProdukt.preis());
    } else {
      System.out.println("Produkt nicht gefunden.");
    }
  }
}
