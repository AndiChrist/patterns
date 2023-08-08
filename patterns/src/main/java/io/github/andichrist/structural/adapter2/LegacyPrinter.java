package io.github.andichrist.structural.adapter2;

// Die bestehende Klasse (Adaptee), die wir an die neue Schnittstelle anpassen möchten
public class LegacyPrinter {
  public void print(String text) {
    System.out.println("Legacy Printer is printing: " + text);
  }
}
