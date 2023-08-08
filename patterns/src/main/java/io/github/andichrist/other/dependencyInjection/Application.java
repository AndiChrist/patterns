package io.github.andichrist.other.dependencyInjection;

public class Application {
  private Logger logger;

  // Konstruktor, um den Logger zu injizieren
  public Application(Logger logger) {
    this.logger = logger;
  }

  public void doSomething() {
    // Irgendwelche Operationen
    logger.log("Doing something in the application.");
  }
}
