package com.yassineaitmalek.DesignPatterns.StructuralPattern.Flyweight;

public class CounterTerrorist implements Player {

  private String task = "DIFFUSE BOMB";

  private String weapon;

  public void assignWeapon(String weapon) {
    this.weapon = weapon;

  }

  public void mission() {
    System.out.println("Terrorist with weapon "
        + weapon + "|" + " Task is " + task);

  }
}
