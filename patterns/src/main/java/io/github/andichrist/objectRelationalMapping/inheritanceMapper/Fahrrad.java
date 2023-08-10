package io.github.andichrist.objectRelationalMapping.inheritanceMapper;

import jakarta.persistence.*;

@Entity
@DiscriminatorValue("fahrrad")
public class Fahrrad extends Fahrzeug {
  private int anzahlGänge;

  // Getter und Setter
}
