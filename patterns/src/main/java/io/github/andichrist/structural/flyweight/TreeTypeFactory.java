package io.github.andichrist.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Die Fliegengewicht-Fabrik: Sie cached und teilt TreeType-Instanzen anhand ihres
// intrinsischen Zustands. Für gleiche Eigenschaften wird dasselbe Objekt zurückgegeben.
public class TreeTypeFactory {
  private final Map<String, TreeType> treeTypes = new HashMap<>();

  public TreeType getTreeType(String name, String color) {
    return treeTypes.computeIfAbsent(name + "-" + color, key -> {
      System.out.println("Erzeuge neues Fliegengewicht: " + key);
      return new ConcreteTreeType(name, color);
    });
  }

  // Anzahl der tatsächlich erzeugten (geteilten) Fliegengewichte
  public int createdTypes() {
    return treeTypes.size();
  }
}
