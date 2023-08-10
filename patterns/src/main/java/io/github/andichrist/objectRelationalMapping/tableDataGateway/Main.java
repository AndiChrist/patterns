package io.github.andichrist.objectRelationalMapping.tableDataGateway;

/*
 Es handelt sich bei dem "Table Data Gateway" um ein Entwurfsmuster aus dem Bereich der
 Softwareentwicklung, das dazu dient, den Zugriff auf eine Datenbanktabelle zu kapseln
 und zentralisiert zu verwalten. Es ermöglicht eine saubere Trennung zwischen der
 Datenbankkommunikation und der restlichen Anwendungslogik.
 */
public class Main {
  public static void main(String[] args) {
    Kunde kunde = KundenGateway.getKundeByID(1);
    if (kunde != null) {
      System.out.println("Gefundener Kunde: " + kunde);
    } else {
      System.out.println("Kunde nicht gefunden.");
    }
  }
}
