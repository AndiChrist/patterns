package io.github.andichrist.objectRelationalMapping.identityMap;

/*
 Das "Identity Map" ist ein Entwurfsmuster, das in der Softwareentwicklung verwendet wird,
 um sicherzustellen, dass jedes Objekt einer bestimmten Klasse nur einmal im Speicher
 existiert. Dies hilft, die Konsistenz der Daten zu gewährleisten und den Overhead bei
 der wiederholten Erzeugung von Objekten zu vermeiden, wenn sie bereits vorhanden sind.

 Das "Identity Map" Muster wird oft in Verbindung mit objektorientierten Datenbankzugriffen
 und ORM-Frameworks (Object-Relational Mapping) eingesetzt. Es kann auch in anderen
 Kontexten nützlich sein, in denen die Wiederverwendung von Objekten wichtig ist.

 Hier ist eine einfache Beschreibung des "Identity Map" Musters:

 1. Erstellung und Hinzufügen von Objekten: Wenn ein Objekt einer bestimmten Klasse
    erstellt oder abgerufen wird, wird es in der "Identity Map" gespeichert. Die "Identity
    Map" ist normalerweise eine Art assoziatives Speicherobjekt, das die Objekte anhand
    eines eindeutigen Schlüssels (z. B. der Datenbank-ID) speichert.

 2. Überprüfung und Wiederverwendung: Wenn eine Anfrage nach einem Objekt mit einem
    bestimmten Schlüssel erfolgt, überprüft die "Identity Map" zuerst, ob das Objekt
    bereits im Speicher vorhanden ist. Falls ja, wird das vorhandene Objekt zurückgegeben,
    anstatt ein neues zu erstellen. Dies verhindert die unnötige Duplizierung von Objekten
    im Speicher.

 3. Aktualisierung und Synchronisation: Wenn Änderungen an einem Objekt vorgenommen werden,
    aktualisiert die "Identity Map" den Zustand des Objekts im Speicher. Dies stellt
    sicher, dass alle Stellen, an denen auf das Objekt zugegriffen wird, die neuesten
    Daten sehen.

 4. Entfernen von Objekten: Wenn ein Objekt nicht mehr benötigt wird oder aus anderen
    Gründen entfernt werden soll, wird es aus der "Identity Map" entfernt, um den
    Speicher freizugeben.

  Die Verwendung des "Identity Map" Musters kann die Leistung verbessern, da weniger
  Objekte erstellt werden müssen, was den Overhead der Objekterzeugung und des Garbage
  Collection-Prozesses reduziert. Es kann auch dazu beitragen, konsistente Daten in
  verteilten Systemen zu gewährleisten, indem verhindert wird, dass mehrere Instanzen
  desselben Objekts gleichzeitig existieren.

  In diesem Beispiel haben wir eine einfache Implementierung der "IdentityMap" erstellt
  und sie verwendet, um Objekte der Klasse "Produkt" zu speichern und abzurufen. Beachten
  Sie, dass in einer realen Anwendung möglicherweise weitere Funktionen und
  Sicherheitsmechanismen hinzugefügt werden müssen, um sicherzustellen, dass die
  "IdentityMap" korrekt und effizient funktioniert.
 */
public class Main {
  public static void main(String[] args) {
    IdentityMap<Produkt> produktMap = new IdentityMap<>();

    Produkt produkt1 = new Produkt(1, "Produkt A");
    Produkt produkt2 = new Produkt(2, "Produkt B");

    // Objekte zur IdentityMap hinzufügen
    produktMap.put(produkt1.id(), produkt1);
    produktMap.put(produkt2.id(), produkt2);

    // Objekte aus der IdentityMap abrufen
    Produkt abgerufenesProdukt1 = produktMap.get(1);
    Produkt abgerufenesProdukt2 = produktMap.get(2);

    System.out.println("Abgerufenes Produkt 1: " + abgerufenesProdukt1.name());
    System.out.println("Abgerufenes Produkt 2: " + abgerufenesProdukt2.name());

    // Objekt aus der IdentityMap entfernen
    produktMap.remove(1);

    // Versuch, das entfernte Objekt erneut abzurufen
    Produkt entferntesProdukt = produktMap.get(1);
    if (entferntesProdukt == null) {
      System.out.println("Produkt mit ID 1 nicht mehr in der IdentityMap.");
    }
  }
}
