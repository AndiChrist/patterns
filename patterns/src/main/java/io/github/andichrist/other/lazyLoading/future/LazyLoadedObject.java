package io.github.andichrist.other.lazyLoading.future;

public class LazyLoadedObject {
  private String data;

  public LazyLoadedObject() {
    System.out.println("LazyLoadedObject is being created.");
    // Simulating expensive initialization
    try {
      Thread.sleep(2000); // Simulate resource-intensive initialization
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    data = "LazyLoadedObject Data";
  }

  public String getData() {
    return data;
  }
}
