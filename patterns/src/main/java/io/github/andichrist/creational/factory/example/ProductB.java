package io.github.andichrist.creational.factory.example;

public class ProductB extends Product {
  @Override
  public void writeName(String name) {
    StringBuilder tempName = new StringBuilder().append(name);
    System.out.println("My reversed name is" +
        tempName.reverse());
  }
}