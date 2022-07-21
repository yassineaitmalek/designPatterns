package com.yassineaitmalek.DesignPatterns.StructuralPattern.Proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

  private String name;

  private RealInternetAccess realInternetAccess;

  public ProxyInternetAccess(String name) {
    this.name = name;
  }

  public void grantInternetAccess() {
    if (getRole(name) > 4) {
      realInternetAccess = new RealInternetAccess(name);
      realInternetAccess.grantInternetAccess();
    } else {
      System.out.println("No Internet access granted. Your job level is below 5");
    }
  }

  public int getRole(String emplName) {

    return 5;
  }

}
