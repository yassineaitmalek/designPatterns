package com.yassineaitmalek.DesignPatterns.CreationalPatterns.ObjectPool;

public class GenerateObjectPool {

  public static void main(String args[]) {

    ObjectPoolDemo op = new ObjectPoolDemo();
    op.setUp();
    op.tearDown();
    op.testObjectPool();

  }

}
