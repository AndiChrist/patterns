package io.github.andichrist.structural.container;

// Blatt-Klasse
class Leaf implements Component {
  private String name;

  public Leaf(String name) {
    this.name = name;
  }

  @Override
  public void operation() {
    System.out.println("Leaf " + name + " operation.");
  }
}
