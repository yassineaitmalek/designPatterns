package com.yassineaitmalek.DesignPatterns.CreationalPatterns.AbstractFactory;

public class PlantFactory extends AbstractFactory {

  @Override
  public Plant getPlant(String plant) {

    if (plant == null) {
      return null;
    }
    if (plant.equalsIgnoreCase("TREE")) {
      return new Tree();
    } else if (plant.equalsIgnoreCase("FLOWER")) {
      return new Flower();
    } else {
      return null;
    }
  }

  @Override
  public Animal getAnimal(String animal) {

    return null;
  }

}
