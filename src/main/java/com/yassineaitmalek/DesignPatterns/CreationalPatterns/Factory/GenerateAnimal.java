package com.yassineaitmalek.DesignPatterns.CreationalPatterns.Factory;

public class GenerateAnimal {
  public static void main(String args[]) {

    AnimalFactory animalFactory = new AnimalFactory();
    Animal cat = animalFactory.getAnimal("cat");
    Animal dog = animalFactory.getAnimal("dog");

    cat.sound();
    dog.sound();
  }

}
