package com.yassineaitmalek.DesignPatterns.StructuralPattern.Decorator;

public class Decorator {
  public static void main(String args[]) {

    VegFood vf = new VegFood();
    Food food = new NonVegFood((Food) vf);

    System.out.println(vf.prepareFood());
    System.out.println(vf.foodPrice());

    System.out.println(food.prepareFood());
    System.out.println(food.foodPrice());

  }
}
