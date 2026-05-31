package io.github.andichrist.creational.multiton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class Multiton {
  private static final Map<String, Multiton> instances = new ConcurrentHashMap<>();
  private final String name;

  private Multiton(String name) {
    this.name = name;
  }

  public static Multiton getInstance(String name) {
    return instances.computeIfAbsent(name, Multiton::new);
  }

  public String getName() {
    return name;
  }
}
