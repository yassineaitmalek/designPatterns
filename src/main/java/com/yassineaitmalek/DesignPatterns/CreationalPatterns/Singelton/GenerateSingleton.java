package com.yassineaitmalek.DesignPatterns.CreationalPatterns.Singelton;

public class GenerateSingleton {

  public static void main(String args[]) {

    Singleton singleton1 = Singleton.getSingleton();
    Singleton singleton2 = Singleton.getSingleton();
    Singleton singleton3 = Singleton.getSingleton();

    singleton1.setState("up");

    // same state
    System.out.println(singleton1.getState());
    System.out.println(singleton2.getState());
    System.out.println(singleton3.getState());

    // same memory adresses
    System.out.println(singleton2);
    System.out.println(singleton3);

  }

}
