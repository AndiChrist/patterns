package io.github.andichrist.creational.builder.example;

public class BrickBuilder extends HouseBuilder {
  public Floor createFloor() {
    floor = new BrickFloor();
    return floor;
  }

  public House createHouse() {
    house = new BrickHouse();
    return house;
  }

  public Roof createRoof() {
    roof = new BrickRoof();
    return roof;
  }

  public Walls createWalls() {
    walls = new BrickWalls();
    return walls;
  }
}
