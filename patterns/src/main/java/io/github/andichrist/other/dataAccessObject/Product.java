package io.github.andichrist.other.dataAccessObject;

// Das Modell für die Daten
public class Product {
  private int id;
  private String name;
  private double price;

  // Konstruktor, Getter und Setter (nicht gezeigt für die Kürze des Beispiels)

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}
