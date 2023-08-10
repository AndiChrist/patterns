package io.github.andichrist.objectRelationalMapping.embeddedValue;

import jakarta.persistence.*;

// Beispiel für eine Entity mit eingebettetem Wertobjekt
@Entity
public class Kunde {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  // das eingebettete Wertobjekt
  @Embedded
  private Adresse adresse;

  // Getter und Setter für die Eigenschaften
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Adresse getAdresse() {
    return adresse;
  }

  public void setAdresse(Adresse adresse) {
    this.adresse = adresse;
  }
}
