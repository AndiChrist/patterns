package io.github.andichrist.objectRelationalMapping.identityMap;

import java.util.HashMap;
import java.util.Map;

// Einfache Implementierung der IdentityMap
class IdentityMap<T> {
  private Map<Object, T> objectMap = new HashMap<>();

  public void put(Object key, T value) {
    objectMap.put(key, value);
  }

  public T get(Object key) {
    return objectMap.get(key);
  }

  public void remove(Object key) {
    objectMap.remove(key);
  }
}
