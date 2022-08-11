package com.yassineaitmalek.DesignPatterns.CreationalPatterns.Builder;

public class Builder {

  private boolean bool;

  private String str;

  private int number;

  public Builder(boolean bool, String str, int number) {
    this.bool = bool;
    this.str = str;
    this.number = number;
  }

  public static SubBuilder builder() {
    return new SubBuilder();
  }

  public static class SubBuilder {

    private boolean bool;

    private String str;

    private int number;

    public SubBuilder() {
    }

    public SubBuilder Bool(boolean bool) {
      this.bool = bool;
      return this;
    }

    public SubBuilder Str(String str) {
      this.str = str;
      return this;
    }

    public SubBuilder Number(int number) {
      this.number = number;
      return this;
    }

    public Builder build() {
      return new Builder(this.bool, this.str, this.number);
    }

  }

  public boolean isBool() {
    return bool;
  }

  public void setBool(boolean bool) {
    this.bool = bool;

  }

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;

  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;

  }

  @Override
  public String toString() {
    return "Builder [bool=" + bool + ", number=" + number + ", str=" + str + "]";
  }

}
