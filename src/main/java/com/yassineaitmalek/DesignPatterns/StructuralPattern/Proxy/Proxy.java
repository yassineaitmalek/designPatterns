package com.yassineaitmalek.DesignPatterns.StructuralPattern.Proxy;

public class Proxy {

  public static void main(String[] args) {
    OfficeInternetAccess access = new ProxyInternetAccess("Yassine");
    access.grantInternetAccess();
  }

}
