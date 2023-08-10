package io.github.andichrist.objectRelationalMapping.embeddedValue;

import jakarta.persistence.Embeddable;

// Beispiel für ein eingebettetes Wertobjekt
@Embeddable
public class Adresse {
  private String straße;
  private String stadt;
  private String postleitzahl;

  public Adresse(String straße, String stadt, String postleitzahl) {
    this.straße = straße;
    this.stadt = stadt;
    this.postleitzahl = postleitzahl;
  }

  public Adresse() {
  }

  // Getter und Setter für die Eigenschaften
  public String getStraße() {
    return straße;
  }

  public void setStraße(String straße) {
    this.straße = straße;
  }

  public String getStadt() {
    return stadt;
  }

  public void setStadt(String stadt) {
    this.stadt = stadt;
  }

  public String getPostleitzahl() {
    return postleitzahl;
  }

  public void setPostleitzahl(String postleitzahl) {
    this.postleitzahl = postleitzahl;
  }
}