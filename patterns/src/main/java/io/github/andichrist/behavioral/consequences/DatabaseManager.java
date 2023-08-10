package io.github.andichrist.behavioral.consequences;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
  private String connectionString;

  public DatabaseManager(String connectionString) {
    this.connectionString = connectionString;
  }

  public Connection openConnection() throws SQLException {
    // Hier Code zur Verbindung zur Datenbank
    return DriverManager.getConnection(connectionString);
  }

  public void closeConnection(Connection connection) throws SQLException {
    // Hier Code zum Schließen der Datenbankverbindung
    connection.close();
  }
}
