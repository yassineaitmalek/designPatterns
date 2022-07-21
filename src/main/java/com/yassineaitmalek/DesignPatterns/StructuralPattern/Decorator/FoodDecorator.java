package com.yassineaitmalek.DesignPatterns.StructuralPattern.Decorator;

public abstract class FoodDecorator implements Food {

  private Food food;

  /**
   * @param food
   */
  public FoodDecorator(Food food) {
    this.food = food;
  }

  public double foodPrice() {

    return this.food.foodPrice();
  }

  public String prepareFood() {

    return this.food.prepareFood();
  }

}
