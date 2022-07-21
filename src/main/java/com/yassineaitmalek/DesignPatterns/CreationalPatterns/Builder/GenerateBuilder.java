package com.yassineaitmalek.DesignPatterns.CreationalPatterns.Builder;

public class GenerateBuilder {
  public static void main(String[] args) {
    Builder build = new Builder();

    build.setBool(true).setNumber(11).setStr("Hello");

    System.out.println(build);
  }

}
