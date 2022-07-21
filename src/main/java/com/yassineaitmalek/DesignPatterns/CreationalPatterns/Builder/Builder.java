package com.yassineaitmalek.DesignPatterns.CreationalPatterns.Builder;

public class Builder {

  private boolean bool;

  private String str;

  private int number;

  /**
   * @return the bool
   */
  public boolean isBool() {
    return bool;
  }

  /**
   * @param bool the bool to set
   */
  public Builder setBool(boolean bool) {
    this.bool = bool;
    return this;
  }

  /**
   * @return the str
   */
  public String getStr() {
    return str;
  }

  /**
   * @param str the str to set
   */
  public Builder setStr(String str) {
    this.str = str;
    return this;
  }

  /**
   * @return the number
   */
  public int getNumber() {
    return number;
  }

  /**
   * @param number the number to set
   */
  public Builder setNumber(int number) {
    this.number = number;
    return this;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    return "Builder [bool=" + bool + ", number=" + number + ", str=" + str + "]";
  }

}
