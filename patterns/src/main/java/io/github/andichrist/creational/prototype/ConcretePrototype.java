package io.github.andichrist.creational.prototype;

// Eine konkrete Implementierung des Prototyp-Interfaces
public class ConcretePrototype implements Prototype {
  private int value;

  public ConcretePrototype(int value) {
    this.value = value;
  }

  @Override
  public Prototype clone() {
    return new ConcretePrototype(this.value);
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
