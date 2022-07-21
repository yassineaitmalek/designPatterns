package com.yassineaitmalek.DesignPatterns.CreationalPatterns.Factory;

public class AnimalFactory {

  public Animal getAnimal(String animal) {

    if (animal.equalsIgnoreCase("DOG")) {
      return new Dog();
    } else if (animal.equalsIgnoreCase("CAT")) {
      return new Cat();
    } else {
      return null;
    }

  }

}
