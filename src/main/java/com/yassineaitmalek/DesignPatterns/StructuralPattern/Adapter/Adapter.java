package com.yassineaitmalek.DesignPatterns.StructuralPattern.Adapter;

public class Adapter {
  public static void main(String args[]) {

    CreditCard targetInterface = new BankCustomer();
    targetInterface.giveBankDetails("ATTIJARIWAFABANK", "YASSINE", 11232423L);
    System.out.print(targetInterface.getCreditCard());

  }

}
