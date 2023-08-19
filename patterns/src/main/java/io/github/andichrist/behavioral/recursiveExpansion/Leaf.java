package io.github.andichrist.behavioral.recursiveExpansion;

// Blattkomponente
class Leaf implements Component {
  @Override
  public void operation() {
    System.out.println("Leaf operation");
  }
}
