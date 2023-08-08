package io.github.andichrist.structural.flyweight;

// Die konkrete Implementierung des Fliegengewichts
public class ConcreteTreeType implements TreeType {
  private String name;
  private String color;
  // Weitere gemeinsame Eigenschaften...

  public ConcreteTreeType(String name, String color) {
    this.name = name;
    this.color = color;
  }

  @Override
  public void display(TreeInfo info) {
    System.out.println("Tree Type: " + name + ", Color: " + color + ", Location: " + info.getLocationX() + "/" + info.getLocationY());
  }
}
