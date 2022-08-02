package com.yassineaitmalek.BehavioralPattern.Iterator;

import java.util.List;

public class CollectionIterator implements Iterator {

  int i;

  private List<String> name;

  public CollectionIterator(List<String> name) {
    this.name = name;
  }

  public boolean hasNext() {
    if (i < name.size()) {
      return true;
    }
    return false;
  }

  public Object next() {
    if (this.hasNext()) {
      return name.get(i++);
    }
    return null;
  }

}
