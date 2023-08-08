package io.github.andichrist.behavioral.chainOfResponsibility.logger;

import io.github.andichrist.behavioral.chainOfResponsibility.logger.Logger.LogLevel;

public class Main {
  public static void main(String[] args) {
    // Build an immutable chain of responsibility
    Logger logger = Logger.consoleLogger(LogLevel.all())
        .appendNext(Logger.emailLogger(LogLevel.FUNCTIONAL_MESSAGE, LogLevel.FUNCTIONAL_ERROR))
        .appendNext(Logger.fileLogger(LogLevel.WARNING, LogLevel.ERROR));

    // Handled by consoleLogger since the console has a loglevel of all
    logger.message("Entering function ProcessOrder().", LogLevel.DEBUG);
    logger.message("Order record retrieved.", LogLevel.INFO);

    // Handled by consoleLogger and fileLogger since filelogger implements Warning & Error
    logger.message("Customer Address details missing in Branch DataBase.", LogLevel.WARNING);
    logger.message("Customer Address details missing in Organization DataBase.", LogLevel.ERROR);

    // Handled by consoleLogger and emailLogger as it implements functional error
    logger.message("Unable to Process Order ORD1 Dated D1 For Customer C1.", LogLevel.FUNCTIONAL_ERROR);

    // Handled by consoleLogger and emailLogger
    logger.message("Order Dispatched.", LogLevel.FUNCTIONAL_MESSAGE);
  }
}
