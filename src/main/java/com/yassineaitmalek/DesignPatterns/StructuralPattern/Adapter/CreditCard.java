package com.yassineaitmalek.DesignPatterns.StructuralPattern.Adapter;

public interface CreditCard {

  public void giveBankDetails(String bankName, String customerName, Long accNumber);

  public String getCreditCard();

}
