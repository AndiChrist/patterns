package io.github.andichrist.other.dataAccessObject;

import java.util.ArrayList;
import java.util.List;

// Die konkrete Implementierung des DAOs
public class InMemoryProductDAO implements ProductDAO {
  private List<Product> products = new ArrayList<>();
  private int nextId = 1;

  @Override
  public void save(Product product) {
    product.setId(nextId++);
    products.add(product);
  }

  @Override
  public void update(Product product) {
    for (Product p : products) {
      if (p.getId() == product.getId()) {
        p.setName(product.getName());
        p.setPrice(product.getPrice());
        break;
      }
    }
  }

  @Override
  public void delete(int id) {
    products.removeIf(p -> p.getId() == id);
  }

  @Override
  public Product findById(int id) {
    for (Product product : products) {
      if (product.getId() == id) {
        return product;
      }
    }
    return null;
  }

  @Override
  public List<Product> findAll() {
    return new ArrayList<>(products);
  }
}
