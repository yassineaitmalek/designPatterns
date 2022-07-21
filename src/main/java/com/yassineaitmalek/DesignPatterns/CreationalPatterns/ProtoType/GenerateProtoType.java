package com.yassineaitmalek.DesignPatterns.CreationalPatterns.ProtoType;

public class GenerateProtoType {
  public static void main(String args[]) {

    Employee emp = new Employee(1, "a", "aa");

    ProtoType protoType = emp.getClone();

    System.out.println(emp);
    System.out.println(protoType);

  }

}
