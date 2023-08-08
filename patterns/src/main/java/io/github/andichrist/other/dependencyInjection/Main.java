package io.github.andichrist.other.dependencyInjection;

/*
 Hier ist ein einfaches Java-Beispiel für das Dependency Injection (DI) Muster.

 Angenommen, wir haben eine Klasse Logger, die für das Protokollieren von Nachrichten
 verantwortlich ist, und eine Klasse Application, die den Logger verwendet, um
 Nachrichten zu protokollieren. Anstatt die Abhängigkeit des Application-Objekts von
 der konkreten Implementierung des Logger in der Application-Klasse zu erzeugen,
 verwenden wir das DI-Muster, um die Abhängigkeit von außen zu injizieren.

 In der Application-Klasse wird der Logger verwendet, um eine Protokollierungsnachricht
 zu erzeugen. Anstatt den Logger direkt zu instanziieren, wird der Logger über den
 Konstruktor injiziert.

 Schließlich können wir die Application-Klasse verwenden und ihr verschiedene
 Implementierungen des Logger bereitstellen.

 Durch das Dependency Injection Muster haben wir die Abhängigkeit von der Application-
 Klasse zur Logger-Implementierung aufgelöst, und wir können verschiedene
 Implementierungen des Logger an die Application-Klasse übergeben, ohne dass die
 Application-Klasse davon wissen muss. Dadurch wird der Code flexibler und besser
 testbar, da wir leicht verschiedene Logging-Mechanismen in verschiedenen Umgebungen
 einsetzen können, ohne den Code der Application-Klasse zu ändern.
 */
public class Main {
  public static void main(String[] args) {
    // Anwendung mit einem ConsoleLogger erstellen
    Application app1 = new Application(new ConsoleLogger());
    app1.doSomething();

    // Anwendung mit einem FileLogger erstellen
    Application app2 = new Application(new FileLogger("app.log"));
    app2.doSomething();
  }
}
