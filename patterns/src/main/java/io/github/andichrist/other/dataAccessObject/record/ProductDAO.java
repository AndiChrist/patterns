package io.github.andichrist.other.dataAccessObject.record;

import java.util.List;

public interface ProductDAO {
  void save(Product product);
  void update(Product product);
  void delete(String name);
  Product findByName(String name);
  List<Product> findAll();
}
