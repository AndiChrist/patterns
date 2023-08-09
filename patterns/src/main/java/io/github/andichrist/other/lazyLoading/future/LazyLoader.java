package io.github.andichrist.other.lazyLoading.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class LazyLoader {
  private FutureTask<LazyLoadedObject> lazyLoadedObjectTask;

  public LazyLoader() {
    lazyLoadedObjectTask = new FutureTask<>(LazyLoadedObject::new);

    Thread initializationThread = new Thread(lazyLoadedObjectTask);
    initializationThread.start();

    System.out.println("LazyLoader is being created.");
  }

  public LazyLoadedObject getLazyLoadedObject() {
    try {
      return lazyLoadedObjectTask.get();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
      return null;
    }
  }
}
