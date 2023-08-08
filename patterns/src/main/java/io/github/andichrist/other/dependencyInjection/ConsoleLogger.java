package io.github.andichrist.other.dependencyInjection;

// Die konkrete Implementierung des Loggers
public class ConsoleLogger implements Logger {
  @Override
  public void log(String message) {
    System.out.println("Console Logger: " + message);
  }
}
