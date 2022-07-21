package com.yassineaitmalek.DesignPatterns.StructuralPattern.Composite;

public class Accountant implements Employee {

  private int id;

  private String name;

  private double salary;

  public Accountant(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  public void add(Employee employee) {
    // this is leaf node so this method is not applicable to this class.
  }

  public Employee getChild(int i) {
    // this is leaf node so this method is not applicable to this class.
    return null;
  }

  public int getId() {
    // TODO Auto-generated method stub
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  public void print() {
    System.out.println("=========================");
    System.out.println("Id =" + getId());
    System.out.println("Name =" + getName());
    System.out.println("Salary =" + getSalary());
    System.out.println("=========================");
  }

  public void remove(Employee employee) {
    // this is leaf node so this method is not applicable to this class.
  }
}
