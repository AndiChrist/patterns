package io.github.andichrist.objectRelationalMapping.inheritanceMapper;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("auto")
public class Auto extends Fahrzeug {
  private int anzahlTüren;

  // Getter und Setter
}
