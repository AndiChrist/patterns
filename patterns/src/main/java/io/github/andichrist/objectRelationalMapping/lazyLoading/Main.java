package io.github.andichrist.objectRelationalMapping.lazyLoading;

/*
 Das "Lazy Loading"-Muster verzögert die Erstellung oder Initialisierung eines Objekts,
 bis es tatsächlich benötigt wird. Dies kann die Leistung verbessern, indem Ressourcen
 nur dann verwendet werden, wenn sie gebraucht werden. Ein häufiges Anwendungsbeispiel
 ist die Verwendung von Lazy Loading bei der Initialisierung von teuren Ressourcen oder
 Datenbankverbindungen.

 In diesem Beispiel wird LazyLoadedObject erst dann erstellt und initialisiert, wenn es
 durch den Aufruf von getLazyLoadedObject() im LazyLoader benötigt wird. Dadurch wird die
 teure Initialisierung verzögert, bis das Objekt wirklich gebraucht wird.
 */
public class Main {
  public static void main(String[] args) {
    LazyLoader lazyLoader = new LazyLoader();

    // At this point, LazyLoadedObject is not created yet
    System.out.println("Before accessing LazyLoadedObject");

    // When we access the lazyLoadedObject, it gets created
    LazyLoadedObject object = lazyLoader.getLazyLoadedObject();

    // Now the object is created and initialized
    System.out.println("After accessing LazyLoadedObject");
    System.out.println("Data: " + object.getData());
  }
}
