package io.github.andichrist.structural.composite;

import java.util.ArrayList;
import java.util.List;

// Die konkrete Implementierung der Komponente für die Komposition von Objekten (Kompositum)
public class Composite implements Component {
  private List<Component> components = new ArrayList<>();

  public void addComponent(Component component) {
    components.add(component);
  }

  @Override
  public void operation() {
    System.out.println("Composite operation:");
    for (Component component : components) {
      component.operation();
    }
  }
}
