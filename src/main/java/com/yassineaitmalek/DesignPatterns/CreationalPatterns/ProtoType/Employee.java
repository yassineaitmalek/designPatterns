package com.yassineaitmalek.DesignPatterns.CreationalPatterns.ProtoType;

public class Employee implements ProtoType {

  private int id;

  private String name;

  private String address;

  public Employee(int id, String name, String address) {
    this.id = id;
    this.name = name;
    this.address = address;
  }

  public ProtoType getClone() {

    return new Employee(this.id, this.name, this.address);
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */

  @Override
  public String toString() {
    return "Employee [address=" + address + ", id=" + id + ", name=" + name + "]";
  }

}
