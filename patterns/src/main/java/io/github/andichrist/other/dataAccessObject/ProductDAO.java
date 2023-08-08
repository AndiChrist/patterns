package io.github.andichrist.other.dataAccessObject;

import java.util.List;

// Das DAO-Interface
public interface ProductDAO {
  void save(Product product);
  void update(Product product);
  void delete(int id);
  Product findById(int id);
  List<Product> findAll();
}
