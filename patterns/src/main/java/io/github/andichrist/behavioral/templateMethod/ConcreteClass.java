package io.github.andichrist.behavioral.templateMethod;

// Eine konkrete Implementierung der abstrakten Klasse
public class ConcreteClass extends AbstractClass {
  @Override
  protected void step1() {
    System.out.println("ConcreteClass: Step 1");
  }

  @Override
  protected void step2() {
    System.out.println("ConcreteClass: Step 2");
  }

  // Optional: Überschreiben der optionalen Methode
  @Override
  protected void step3() {
    System.out.println("ConcreteClass: Step 3 (Overridden)");
  }
}
