package com.yassineaitmalek.DesignPatterns.StructuralPattern.Flyweight;

public class Terrorist implements Player {

  private String task = "PALNT A BOMB";

  private String weapon;

  public void assignWeapon(String weapon) {
    this.weapon = weapon;

  }

  public void mission() {
    System.out.println("Terrorist with weapon "
        + weapon + "|" + " Task is " + task);

  }

}
