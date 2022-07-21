package com.yassineaitmalek.DesignPatterns.CreationalPatterns.AbstractFactory;

public class GenerateFactory {
  public static void main(String args[]) {

    AbstractFactory animalFactory = FactoryCreator.getFactory("animal");
    AbstractFactory plantFactory = FactoryCreator.getFactory("plant");

    Animal cat = animalFactory.getAnimal("cat");
    Animal dog = animalFactory.getAnimal("dog");

    Plant tree = plantFactory.getPlant("tree");
    Plant flower = plantFactory.getPlant("flower");

    cat.sound();
    dog.sound();

    tree.type();
    flower.type();
  }

}
