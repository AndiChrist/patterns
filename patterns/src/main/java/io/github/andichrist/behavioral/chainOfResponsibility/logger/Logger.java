package io.github.andichrist.behavioral.chainOfResponsibility.logger;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.function.Consumer;

@FunctionalInterface
public interface Logger {

  enum LogLevel {
    INFO, DEBUG, WARNING, ERROR, FUNCTIONAL_MESSAGE, FUNCTIONAL_ERROR;

    public static LogLevel[] all() {
      return values();
    }
  }

  void message(String msg, LogLevel severity);

  default Logger appendNext(Logger nextLogger) {
    return (msg, severity) -> {
      message(msg, severity);
      nextLogger.message(msg, severity);
    };
  }

  static Logger logger(LogLevel[] levels, Consumer<String> writeMessage) {
    EnumSet<LogLevel> set = EnumSet.copyOf(Arrays.asList(levels));
    return (msg, severity) -> {
      if (set.contains(severity)) {
        writeMessage.accept(String.format("%s: %s", severity, msg));
      }
    };
  }

  static Logger consoleLogger(LogLevel... levels) {
    return logger(levels, msg -> System.out.println("Writing to console: " + msg));
  }

  static Logger emailLogger(LogLevel... levels) {
    return logger(levels, msg -> System.err.println("Sending via email: " + msg));
  }

  static Logger fileLogger(LogLevel... levels) {
    return logger(levels, msg -> System.err.println("Writing to Log File: " + msg));
  }

}
