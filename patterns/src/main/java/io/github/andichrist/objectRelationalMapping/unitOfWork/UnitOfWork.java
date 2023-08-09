package io.github.andichrist.objectRelationalMapping.unitOfWork;

import java.util.ArrayList;
import java.util.List;

/*
 Das "Unit of Work"-Muster ist ein Entwurfsmuster aus der Softwareentwicklung, das häufig
 im Zusammenhang mit der Datenbankinteraktion und der Verwaltung von Transaktionen
 verwendet wird. Es zielt darauf ab, die Koordination von mehreren Änderungen an einem
 oder mehreren Datenbankobjekten in einer einzigen Transaktion zu erleichtern.

 Das "Unit of Work"-Muster behandelt normalerweise folgende Aspekte:

 1. Aggregation von Änderungen: Es erlaubt das Sammeln mehrerer Änderungen an
 Datenbankobjekten (wie Einfügen, Aktualisieren oder Löschen) in einer einzelnen
 Einheit (Unit). Dies erleichtert die Zusammenarbeit zwischen verschiedenen Teilen der
 Anwendung, die Änderungen vornehmen.

 2. Transaktionsverwaltung: Es stellt sicher, dass alle gesammelten Änderungen in einer
 einzigen Transaktion ausgeführt werden. Entweder werden alle Änderungen erfolgreich
 durchgeführt, oder keine von ihnen wird durchgeführt, um Dateninkonsistenzen zu vermeiden.

 3. Kontextbezogene Datenbankinteraktion: Es ermöglicht, dass die Datenbankinteraktion
 und Transaktionsverwaltung innerhalb des "Unit of Work"-Kontexts erfolgen. Das bedeutet,
 dass alle Änderungen in einem einzigen logischen Zusammenhang stehen und atomar
 ausgeführt werden.

 "Ein Unit of Work verfolgt alle Änderungen, welche Sie während einer Business-Transaktion
 durchführen, welche sich auf die Datenbank auswirken können. Wenn Sie fertig sind, stellt
 es fest was gemacht werden muss, um die Datenbank als Ergebnis dieser Änderungen zu ändern."
 -- Martin Fowler
 */
public class UnitOfWork {
  // Listen von Domänenobjekten
  private List<Product> newProducts = new ArrayList<>();
  private List<Product> dirtyProducts = new ArrayList<>();
  private List<Product> removedProducts = new ArrayList<>();

  public void registerNew(Product product) {
    newProducts.add(product);
  }

  public void registerDirty(Product product) {
    if (!newProducts.contains(product)) {
      dirtyProducts.add(product);
    }
  }

  public void registerRemoved(Product product) {
    if (newProducts.remove(product)) {
      return;
    }
    dirtyProducts.remove(product);
    removedProducts.add(product);
  }

  public void commit() {
    for (Product product : newProducts) {
      // Logik zum Einfügen in die Datenbank
    }
    for (Product product : dirtyProducts) {
      // Logik zum Aktualisieren in der Datenbank
    }
    for (Product product : removedProducts) {
      // Logik zum Löschen aus der Datenbank
    }
    // Transaktionsverwaltung
  }
}
