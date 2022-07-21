package com.yassineaitmalek.DesignPatterns.StructuralPattern.Composite;

public class Composite {
  public static void main(String args[]) {
    Employee emp1 = new Cashier(101, "Cashier 1", 20000.0);
    Employee emp2 = new Cashier(102, "Cashier 2", 25000.0);
    Employee emp3 = new Accountant(103, "Accountant 1", 30000.0);
    Employee manager1 = new BankManager(100, "BankManager 1", 100000.0);

    manager1.add(emp1);
    manager1.add(emp2);
    manager1.add(emp3);
    manager1.print();
  }
}
