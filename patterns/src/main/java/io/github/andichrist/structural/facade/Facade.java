package io.github.andichrist.structural.facade;

// Die Fassade, die eine vereinfachte Schnittstelle zum komplexen Subsystem bereitstellt
public class Facade {
  private SubsystemA subsystemA;
  private SubsystemB subsystemB;
  private SubsystemC subsystemC;

  public Facade() {
    subsystemA = new SubsystemA();
    subsystemB = new SubsystemB();
    subsystemC = new SubsystemC();
  }

  // Einfache Schnittstelle, die häufig genutzte Funktionen des Subsystems bündelt
  public void simplifiedOperation() {
    subsystemA.operationA();
    subsystemB.operationB();
  }
}
