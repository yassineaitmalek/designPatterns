package com.yassineaitmalek.DesignPatterns.CreationalPatterns.Builder;

public class GenerateBuilder {
  public static void main(String[] args) {
    Builder build = Builder.builder().Bool(true).Number(1).Str("str").build();

    System.out.println(build);
  }

}
