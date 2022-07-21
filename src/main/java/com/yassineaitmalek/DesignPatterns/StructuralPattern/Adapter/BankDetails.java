package com.yassineaitmalek.DesignPatterns.StructuralPattern.Adapter;

public class BankDetails {

  private String bankName;

  private String accHolderName;

  private long accNumber;

  /**
   * @return the bankName
   */
  public String getBankName() {
    return bankName;
  }

  /**
   * @param bankName the bankName to set
   */
  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  /**
   * @return the accHolderName
   */
  public String getAccHolderName() {
    return accHolderName;
  }

  /**
   * @param accHolderName the accHolderName to set
   */
  public void setAccHolderName(String accHolderName) {
    this.accHolderName = accHolderName;
  }

  /**
   * @return the accNumber
   */
  public long getAccNumber() {
    return accNumber;
  }

  /**
   * @param accNumber the accNumber to set
   */
  public void setAccNumber(long accNumber) {
    this.accNumber = accNumber;
  }

}
