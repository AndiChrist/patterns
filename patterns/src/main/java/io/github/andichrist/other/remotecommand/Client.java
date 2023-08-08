package io.github.andichrist.other.remoteCommand;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
  public static void main(String[] args) {
    try {
      Registry registry = LocateRegistry.getRegistry("localhost");
      Calculator calculator = (Calculator) registry.lookup("CalculatorService");

      int resultAdd = calculator.add(10, 5);
      int resultSubtract = calculator.subtract(10, 5);

      System.out.println("Addition result: " + resultAdd);
      System.out.println("Subtraction result: " + resultSubtract);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
