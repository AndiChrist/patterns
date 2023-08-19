package io.github.andichrist.behavioral.recursiveExpansion;

import java.util.ArrayList;
import java.util.List;

// Zusammengesetzte Komponente
class Composite implements Component {
  private List<Component> components = new ArrayList<>();

  public void addComponent(Component component) {
    components.add(component);
  }

  @Override
  public void operation() {
    System.out.println("Composite operation");
    for (Component component : components) {
      component.operation();
    }
  }
}
