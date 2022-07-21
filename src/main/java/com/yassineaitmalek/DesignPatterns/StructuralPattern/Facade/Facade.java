package com.yassineaitmalek.DesignPatterns.StructuralPattern.Facade;

public class Facade {

  public static void main(String args[]) {

    PhoneOwner phoneOwner = new PhoneOwner();

    phoneOwner.iphoneSale();
    phoneOwner.samsungSale();

  }

}
