package io.github.andichrist.other.connectionPool;

import java.sql.Connection;

public class Main {
  public static void main(String[] args) {
    ConnectionPool pool = new ConnectionPool(2);
    System.out.println("Frei: " + pool.availableConnections()); // 2

    Connection a = pool.getConnection();
    Connection b = pool.getConnection();
    System.out.println("Entliehen: " + a + ", " + b);
    System.out.println("Frei: " + pool.availableConnections()); // 0

    // Verbindung zurückgeben -> wird wiederverwendet
    pool.releaseConnection(a);
    System.out.println("Frei: " + pool.availableConnections()); // 1

    Connection c = pool.getConnection();
    System.out.println("Wiederverwendet a == c: " + (a == c)); // true
  }
}
