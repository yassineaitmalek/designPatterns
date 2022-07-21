package com.yassineaitmalek.DesignPatterns.StructuralPattern.Proxy;

public class RealInternetAccess implements OfficeInternetAccess {

  private String name;

  public RealInternetAccess(String name) {
    this.name = name;
  }

  public void grantInternetAccess() {
    System.out.println("Internet Access granted for employee: " + name);
  }

}
