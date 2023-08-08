package io.github.andichrist.other.dataAccessObject.record;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    ProductDAO productDAO = new InMemoryProductDAO();

    Product product1 = new Product("Laptop", 1000.0);
    Product product2 = new Product("Smartphone", 500.0);

    productDAO.save(product1);
    productDAO.save(product2);

    Product foundProduct = productDAO.findByName("Laptop");
    if (foundProduct != null) {
      System.out.println("Found Product: " + foundProduct);
    }

    // Update eines Produkts
    Product updatedProduct = new Product("Laptop", 1200.0);
    productDAO.update(updatedProduct);

    List<Product> allProducts = productDAO.findAll();
    System.out.println("All Products: " + allProducts);
  }
}
