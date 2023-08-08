package io.github.andichrist.other.remoteCommand;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
  public static void main(String[] args) {
    try {
      Calculator calculator = new CalculatorImpl();
      Registry registry = LocateRegistry.createRegistry(1099);
      registry.rebind("CalculatorService", calculator);

      System.out.println("Server is running...");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
