package io.github.andichrist.structural.adapter2;

// Der Klassenadapter, der die neue Schnittstelle implementiert und den LegacyPrinter verwendet
public class PrinterAdapter extends LegacyPrinter implements Printer {
  @Override
  public void printText(String text) {
    System.out.println("Adapter is converting the new print request to the legacy print method.");
    print(text);
  }
}
