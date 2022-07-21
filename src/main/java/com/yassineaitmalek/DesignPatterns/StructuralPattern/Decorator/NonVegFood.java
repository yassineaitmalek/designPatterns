package com.yassineaitmalek.DesignPatterns.StructuralPattern.Decorator;

public class NonVegFood extends FoodDecorator {

  public NonVegFood(Food food) {
    super(food);

  }

  public String prepareFood() {

    return super.prepareFood() + " With Roasted Chiken and Chiken Curry  ";
  }

  public double foodPrice() {

    return super.foodPrice() + 150.0;
  }

}
