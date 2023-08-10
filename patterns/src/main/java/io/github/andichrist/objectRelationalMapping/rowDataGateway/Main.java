package io.github.andichrist.objectRelationalMapping.rowDataGateway;

/*
 Ähnlich dem "Table Data Gateway" liegt der Fokus beim "Row Data Gateway" auf der
 Datenbankinteraktion, jedoch auf der Ebene einzelner Zeilen (Datensätze) anstatt auf
 der gesamten Tabelle.

 Das "Row Data Gateway" Muster stellt eine Klasse oder eine Gruppe von Klassen dar, die
 für die Verwaltung einer einzelnen Zeile in einer Datenbanktabelle verantwortlich sind.
 Jede Instanz dieser Klasse repräsentiert einen bestimmten Datensatz und enthält Methoden
 zum Lesen, Schreiben und Aktualisieren der Datenbankwerte für diese Zeile.
 */
public class Main {
  public static void main(String[] args) {
    ProduktGateway produkt = new ProduktGateway(1);
    System.out.println("Produktname: " + produkt.getName());
    System.out.println("Produktpreis: " + produkt.getPreis());

    produkt.setName("Neuer Produktname");
    produkt.setPreis(29.99);

    System.out.println("Aktualisierter Produktname: " + produkt.getName());
    System.out.println("Aktualisierter Produktpreis: " + produkt.getPreis());
  }
}
