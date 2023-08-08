package io.github.andichrist.structural.flyweight;

// Die Klasse, die den extrinsischen Zustand enthält
public class TreeInfo {
  private int locationX;
  private int locationY;
  // Weitere extrinsische Eigenschaften...

  public TreeInfo(int locationX, int locationY) {
    this.locationX = locationX;
    this.locationY = locationY;
  }

  public int getLocationX() {
    return locationX;
  }

  public int getLocationY() {
    return locationY;
  }

  // Weitere Methoden zum Setzen und Abfragen von extrinsischen Eigenschaften...
}