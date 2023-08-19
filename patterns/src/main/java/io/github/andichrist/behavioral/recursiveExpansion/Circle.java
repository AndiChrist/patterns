package io.github.andichrist.behavioral.recursiveExpansion;

// Spezialisierte Formen
class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double area() {
    return Math.PI * radius * radius;
  }
}
