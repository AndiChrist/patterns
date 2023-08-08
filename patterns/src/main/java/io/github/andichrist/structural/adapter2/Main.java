package io.github.andichrist.structural.adapter2;

/*
 Hier ist ein Beispiel für ein Klassenadapter in Java:

 Angenommen, wir haben eine bestehende Klasse namens LegacyPrinter, die eine Methode
 print(String text) hat, aber wir möchten eine neue Schnittstelle namens Printer verwenden,
 die eine Methode printText(String text) bereitstellt. Der Klassenadapter hilft dabei, die
 alte Funktionalität mit der neuen Schnittstelle zu verbinden.

 In diesem Beispiel erbt der PrinterAdapter von LegacyPrinter und implementiert gleichzeitig
 die neue Schnittstelle Printer. Durch die Vererbung erhält der Adapter Zugriff auf die
 Funktionalität des LegacyPrinter und kann die Methode print(String text) nutzen, um die
 Anfragen der neuen Schnittstelle printText(String text) zu übersetzen.

 Der Klassenadapter ermöglicht es uns, den LegacyPrinter in das neue System zu integrieren,
 indem er als Implementierung der neuen Printer-Schnittstelle dient, ohne dass wir den
 LegacyPrinter selbst ändern müssen.
 */
public class Main {
  public static void main(String[] args) {
    Printer printer = new PrinterAdapter();

    // Aufruf der neuen Schnittstelle, die den Klassenadapter verwendet
    printer.printText("Hello, this is the new Printer interface!");
  }
}
