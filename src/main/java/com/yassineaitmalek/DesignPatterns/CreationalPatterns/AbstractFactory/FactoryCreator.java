package com.yassineaitmalek.DesignPatterns.CreationalPatterns.AbstractFactory;

public class FactoryCreator {

  public static AbstractFactory getFactory(String choice) {
    if (choice == null) {
      return null;
    }
    if (choice.equalsIgnoreCase("PLANT")) {
      return new PlantFactory();
    } else if (choice.equalsIgnoreCase("ANIMAL")) {
      return new AnimalFactory();
    }
    return null;
  }
}
