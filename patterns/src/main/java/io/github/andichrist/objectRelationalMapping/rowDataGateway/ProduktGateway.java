package io.github.andichrist.objectRelationalMapping.rowDataGateway;

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

  private int id;
  private String name;
  private double preis;

  public ProduktGateway(int id) {
    this.id = id;
    load();
  }

  private void load() {
    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
      String query = "SELECT * FROM produkte WHERE id = ?";
      try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setInt(1, id);
        try (ResultSet resultSet = preparedStatement.executeQuery()) {
          if (resultSet.next()) {
            name = resultSet.getString("name");
            preis = resultSet.getDouble("preis");
          }
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
    update();
  }

  public double getPreis() {
    return preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
    update();
  }

  private void update() {
    try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
      String query = "UPDATE produkte SET name = ?, preis = ? WHERE id = ?";
      try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
        preparedStatement.setString(1, name);
        preparedStatement.setDouble(2, preis);
        preparedStatement.setInt(3, id);
        preparedStatement.executeUpdate();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
