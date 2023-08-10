package io.github.andichrist.objectRelationalMapping.tableDataGateway;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Table Data Gateway für die Tabelle "Kunden"
public class KundenGateway {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/meine-datenbank";
  private static final String DB_USER = "benutzername";
  private static final String DB_PASSWORD = "passwort";

  // Methode zur Abfrage eines Kunden anhand seiner ID
  public static Kunde getKundeByID(int id) {
    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
      String query = "SELECT * FROM kunden WHERE id = ?";
      try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
          if (resultSet.next()) {
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            return new Kunde(id, name, email);
          }
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  // Weitere Methoden zur Datenbankinteraktion könnten hier hinzugefügt werden
}
