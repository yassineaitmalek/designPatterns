package com.yassineaitmalek.BehavioralPattern.Iterator;

public class ItteratorPattern {

  public static void main(String[] args) {
    Collection cmpnyRepository = new Collection();

    for (Iterator iter = cmpnyRepository.getIterator(); iter.hasNext();) {
      String name = (String) iter.next();
      System.out.println("Name : " + name);
    }
  }

}
