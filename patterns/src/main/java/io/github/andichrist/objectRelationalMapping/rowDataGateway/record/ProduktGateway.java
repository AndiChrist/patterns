package io.github.andichrist.objectRelationalMapping.rowDataGateway.record;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// Row Data Gateway für die Tabelle "Produkte"
public class ProduktGateway {
  private static final String DB_URL = "jdbc:mysql://localhost:3306/meine-datenbank";
  private static final String DB_USER = "benutzername";
  private static final String DB_PASSWORD = "passwort";

  public static Produkt getProduktByID(int id) {
    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
      String query = "SELECT * FROM produkte WHERE id = ?";
      try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
          if (resultSet.next()) {
            String name = resultSet.getString("name");
            double preis = resultSet.getDouble("preis");
            return new Produkt(id, name, preis);
          }
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void updateProdukt(Produkt produkt) {
    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
      String query = "UPDATE produkte SET name = ?, preis = ? WHERE id = ?";
      try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setString(1, produkt.name());
        preparedStatement.setDouble(2, produkt.preis());
        preparedStatement.setInt(3, produkt.id());
        preparedStatement.executeUpdate();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
