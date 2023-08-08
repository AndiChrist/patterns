package io.github.andichrist.behavioral.templateMethod;

// Die abstrakte Klasse mit der Schablonenmethode
public abstract class AbstractClass {
  public void templateMethod() {
    // Führe allgemeine Schritte aus
    step1();
    step2();
    step3();
    // Eventuell weitere allgemeine Schritte...
  }

  // Abstrakte Methoden, die von den Unterklassen implementiert werden müssen
  protected abstract void step1();
  protected abstract void step2();

  // Optionale Methode, die von den Unterklassen überschrieben werden kann
  protected void step3() {
    // Standardimplementierung
  }
}
