package io.github.andichrist.other.dependencyInjection;

// Die konkrete Implementierung des Loggers
public class FileLogger implements Logger {
  private String filename;

  public FileLogger(String filename) {
    this.filename = filename;
  }

  @Override
  public void log(String message) {
    // Code zum Schreiben der Nachricht in eine Datei
    // Für dieses Beispiel einfachheitshalber nicht implementiert.
    System.out.println("File Logger: " + message);
  }
}