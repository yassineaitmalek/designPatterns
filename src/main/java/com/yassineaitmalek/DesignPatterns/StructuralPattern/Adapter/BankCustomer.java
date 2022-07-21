package com.yassineaitmalek.DesignPatterns.StructuralPattern.Adapter;

public class BankCustomer extends BankDetails implements CreditCard {

  public void giveBankDetails(String bankName, String customerName, Long accNumber) {

    setAccHolderName(customerName);
    setAccNumber(accNumber);
    setBankName(bankName);

  }

  public String getCreditCard() {
    // TODO Auto-generated method stub
    return ("The Account number " + this.getAccNumber() + " of " + this.getAccHolderName() + " in " + this.getBankName()
        + " bank is valid and authenticated for issuing the credit card. ");
  }

}
