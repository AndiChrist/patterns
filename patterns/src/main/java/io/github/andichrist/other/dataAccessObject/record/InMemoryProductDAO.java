package io.github.andichrist.other.dataAccessObject.record;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductDAO implements ProductDAO {
  private List<Product> products = new ArrayList<>();

  @Override
  public void save(Product product) {
    products.add(product);
  }

  @Override
  public void update(Product updatedProduct) {
    Product existingProduct = findByName(updatedProduct.name());
    if (existingProduct != null) {
      products.remove(existingProduct);
      products.add(updatedProduct);
    } else {
      System.out.println("Product with name '" + updatedProduct.name() + "' not found.");
    }
  }

  @Override
  public void delete(String name) {
    products.removeIf(product -> product.name().equals(name));
  }

  @Override
  public Product findByName(String name) {
    return products.stream()
        .filter(product -> product.name().equals(name))
        .findFirst()
        .orElse(null);
  }

  @Override
  public List<Product> findAll() {
    return new ArrayList<>(products);
  }
}
