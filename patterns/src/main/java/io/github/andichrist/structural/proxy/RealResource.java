package io.github.andichrist.structural.proxy;

// Das eigentliche Objekt, das erst bei Bedarf erstellt werden soll
public class RealResource implements Resource {
  public RealResource() {
    // Ressourcenintensive Initialisierung, z. B. Laden von Daten aus einer Datenbank
    System.out.println("Real Resource is being created...");
  }

  @Override
  public void operation() {
    System.out.println("Real Resource operation");
  }
}
