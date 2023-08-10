package io.github.andichrist.objectRelationalMapping.identityField;

/*
 Das "Identity Field" ist ein Entwurfsmuster, das in der Softwareentwicklung verwendet
 wird, um die Identität eines Objekts zu definieren. Die Identität eines Objekts wird
 normalerweise durch ein eindeutiges Feld oder Attribut repräsentiert, das als "Identity
 Field" bezeichnet wird. Dieses Feld enthält einen Wert, der das Objekt eindeutig
 identifiziert, selbst wenn sich die anderen Eigenschaften des Objekts ändern.

 Das "Identity Field" Muster wird oft in Verbindung mit anderen Mustern wie "Data Mapper"
 oder "UnitOfWork" verwendet, um die Persistenz und das Verwalten von Objekten in einer
 Datenbank zu erleichtern. Es ist besonders nützlich, wenn Objekte in einem verteilten
 System oder über verschiedene Ebenen hinweg (z. B. Client und Server) identifiziert
 werden müssen.
 */
public class Main {
  public static void main(String[] args) {
    Produkt produkt1 = new Produkt(1, "Produkt A");
    Produkt produkt2 = new Produkt(2, "Produkt B");

    // Identitätsfeld zur Identifikation verwenden
    int produkt1Id = produkt1.id();
    int produkt2Id = produkt2.id();

    // Vergleich der Identitätsfelder, um Objekte zu identifizieren
    if (produkt1Id == produkt2Id) {
      System.out.println("Die Produkte haben dieselbe Identität.");
    } else {
      System.out.println("Die Produkte haben unterschiedliche Identitäten.");
    }
  }
}
