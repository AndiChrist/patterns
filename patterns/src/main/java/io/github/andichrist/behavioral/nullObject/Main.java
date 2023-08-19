package io.github.andichrist.behavioral.nullObject;

/*
 Das "Null Object"-Muster ist ein Entwurfsmuster, das dazu dient, mit Nullreferenzen
 umzugehen und NullPointerExceptions zu vermeiden. Es definiert eine spezielle Null-
 Implementierung einer Schnittstelle oder Klasse, die anstelle einer tatsächlichen
 Nullreferenz zurückgegeben wird, wenn ein Objekt nicht verfügbar oder nicht initialisiert
 ist.

 Hier ist ein einfaches Java-Beispiel für das "Null Object"-Muster.

 Im Beispiel haben wir das "Null Object"-Muster implementiert, um eine Null-Implementierung
 des Loggers zu erstellen. Dadurch können wir sicherstellen, dass selbst dann, wenn ein
 Null-Logger verwendet wird (z. B. wenn ein Logger nicht initialisiert wurde), der Code
 ohne Fehler ausgeführt wird und keine NullPointerExceptions auftreten.

 Das "Null Object"-Muster ist nützlich, um mit Situationen umzugehen, in denen es zu
 Nullreferenzen kommen kann, und bietet eine elegante Möglichkeit, diese Fälle abzufangen
 und einen sinnvollen Standardwert oder eine Standardaktion bereitzustellen.
 */
public class Main {
  public static void main(String[] args) {
    // Verwendung der konkreten Logger-Implementierung
    User user1 = new User(new ConsoleLogger());
    user1.doSomething();

    // Verwendung der Null-Logger-Implementierung (keine Ausgabe)
    User user2 = new User(new NullLogger());
    user2.doSomething();
  }
}
