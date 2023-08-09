package io.github.andichrist.other.lazyLoading.future;

/*
 Die Verwendung von Futures ist eine Möglichkeit, das Lazy Loading-Muster in Java zu
 implementieren und dabei asynchrone Operationen zu nutzen. Futures können verwendet
 werden, um die Ressourceninitialisierung asynchron auszuführen, während der Hauptthread
 andere Aufgaben erledigt.

 In diesem Beispiel wird die Ressourceninitialisierung von LazyLoadedObject in einem
 separaten Thread mithilfe von FutureTask und Callable durchgeführt. Dadurch kann der
 Hauptthread weiterarbeiten, während die Initialisierung im Hintergrund stattfindet.
 Wenn getLazyLoadedObject() aufgerufen wird, wird gewartet, bis die Initialisierung
 abgeschlossen ist, und das Ergebnis wird zurückgegeben. Dies ermöglicht eine effiziente
 Nutzung von Ressourcen und parallele Ausführung.
 */
public class Main {
  public static void main(String[] args) {
    LazyLoader lazyLoader = new LazyLoader();

    // At this point, LazyLoadedObject is not created yet
    System.out.println("Before accessing LazyLoadedObject");

    // When we access the lazyLoadedObject, it gets created asynchronously
    LazyLoadedObject object = lazyLoader.getLazyLoadedObject();

    // Now the object is created and initialized
    System.out.println("After accessing LazyLoadedObject");
    System.out.println("Data: " + object.getData());
  }
}
