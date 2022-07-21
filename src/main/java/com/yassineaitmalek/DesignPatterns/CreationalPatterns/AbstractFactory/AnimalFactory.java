package com.yassineaitmalek.DesignPatterns.CreationalPatterns.AbstractFactory;

public class AnimalFactory extends AbstractFactory {

  @Override
  public Animal getAnimal(String animal) {
    if (animal == null) {
      return null;
    }

    if (animal.equalsIgnoreCase("DOG")) {
      return new Dog();
    } else if (animal.equalsIgnoreCase("CAT")) {
      return new Cat();
    } else {
      return null;
    }

  }

  @Override
  public Plant getPlant(String plant) {

    return null;
  }

}
