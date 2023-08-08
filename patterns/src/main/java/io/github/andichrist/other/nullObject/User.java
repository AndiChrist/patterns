package io.github.andichrist.other.nullObject;

class User {
  private Logger logger;

  // Konstruktor mit Dependency Injection (Logger wird übergeben)
  public User(Logger logger) {
    this.logger = logger;
  }

  public void doSomething() {
    // Dummy-Aktion
    logger.log("Something happened in the user class.");
  }
}
