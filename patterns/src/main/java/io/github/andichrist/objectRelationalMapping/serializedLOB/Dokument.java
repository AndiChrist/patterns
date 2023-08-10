package io.github.andichrist.objectRelationalMapping.serializedLOB;

import jakarta.persistence.*;

// Beispiel für eine Entity mit einem serialisierten LOB
@Entity
public class Dokument {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @Lob
  private byte[] inhalt; // Das LOB-Feld für den serialisierten Inhalt

  public Dokument(String name, byte[] inhalt) {
    this.name = name;
    this.inhalt = inhalt;
  }

  public Dokument() {
  }

  // Getter und Setter für die Eigenschaften

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public byte[] getInhalt() {
    return inhalt;
  }

  public void setInhalt(byte[] inhalt) {
    this.inhalt = inhalt;
  }
}
