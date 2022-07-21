package com.yassineaitmalek.DesignPatterns.StructuralPattern.Facade;

public class PhoneOwner {

  private Mobile iphone;

  private Mobile samsung;

  public PhoneOwner() {
    this.iphone = new Iphone();
    this.samsung = new Samsung();
  }

  public void iphoneSale() {
    System.out.println(this.iphone.modelNo());
    System.out.println(this.iphone.price());
  }

  public void samsungSale() {
    System.out.println(this.samsung.modelNo());
    System.out.println(this.samsung.price());
  }

}
