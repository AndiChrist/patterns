package io.github.andichrist.other.inversionOfControl;

public class Application {
  private Logger logger;

  // Konstruktor für den Dependency Injection durch den IoC-Container
  public Application(Logger logger) {
    this.logger = logger;
  }

  public void doSomething() {
    // Irgendwelche Operationen
    logger.log("Doing something in the application.");
  }
}
