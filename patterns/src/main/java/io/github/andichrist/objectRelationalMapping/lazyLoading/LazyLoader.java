package io.github.andichrist.objectRelationalMapping.lazyLoading;

public class LazyLoader {
  private LazyLoadedObject lazyLoadedObject;

  public LazyLoader() {
    // LazyLoadedObject is not created during construction
    System.out.println("LazyLoader is being created.");
  }

  public LazyLoadedObject getLazyLoadedObject() {
    if (lazyLoadedObject == null) {
      lazyLoadedObject = new LazyLoadedObject();
    }
    return lazyLoadedObject;
  }
}
