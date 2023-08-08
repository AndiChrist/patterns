package io.github.andichrist.structural.composite;

// Die konkrete Implementierung der Komponente für einzelne Objekte (Blatt)
public class Leaf implements Component {
  private String name;

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void operation() {
    System.out.println("Leaf " + name + " operation");
  }
}
