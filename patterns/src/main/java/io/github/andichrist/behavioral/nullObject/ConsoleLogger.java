package io.github.andichrist.behavioral.nullObject;

// Die konkrete Implementierung des Loggers
class ConsoleLogger implements Logger {
  @Override
  public void log(String message) {
    System.out.println("Log: " + message);
  }
}
