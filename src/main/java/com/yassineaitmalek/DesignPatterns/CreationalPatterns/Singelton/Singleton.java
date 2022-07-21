package com.yassineaitmalek.DesignPatterns.CreationalPatterns.Singelton;

public class Singleton {

  private static Singleton singleton = new Singleton();

  private Singleton() {
  }

  private String state;

  public static Singleton getSingleton() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;

  }

  /**
   * @return the state
   */
  public String getState() {
    return state;
  }

  /**
   * @param state the state to set
   */
  public void setState(String state) {
    this.state = state;
  }

}
