package com.yassineaitmalek.BehavioralPattern.Iterator;

import java.util.Arrays;
import java.util.List;

public class Collection implements Container {

  public List<String> name = Arrays.asList("a", "b");

  public Iterator getIterator() {
    return new CollectionIterator(name);
  }

}
