package com.yassineaitmalek.DesignPatterns.CreationalPatterns.ObjectPool;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public abstract class ObjectPool<T> {

  public ObjectPool(final int minObjects) {
    // initialize pool

    initialize(minObjects);

  }

  private ConcurrentLinkedQueue<T> pool;

  private ScheduledExecutorService executorService;

  protected abstract T createObject();

  private void initialize(final int minObjects) {
    pool = new ConcurrentLinkedQueue<T>();
    for (int i = 0; i < minObjects; i++) {
      pool.add(createObject());
    }
  }

  public void shutdown() {
    if (executorService != null) {
      executorService.shutdown();
    }
  }

  public void returnObject(T object) {
    if (object == null) {
      return;
    }
    this.pool.offer(object);
  }

  public T borrowObject() {
    T object;
    if ((object = pool.poll()) == null) {
      object = createObject();
    }
    return object;
  }

  public ObjectPool(final int minObjects, final int maxObjects, final long validationInterval) {

    initialize(minObjects);
    executorService = Executors.newSingleThreadScheduledExecutor();
    executorService.scheduleWithFixedDelay(new Runnable() {

      public void run() {

        int size = pool.size();

        if (size < minObjects) {
          int sizeToBeAdded = minObjects + size;
          for (int i = 0; i < sizeToBeAdded; i++) {
            pool.add(createObject());
          }
        } else if (size > maxObjects) {
          int sizeToBeRemoved = size - maxObjects;
          for (int i = 0; i < sizeToBeRemoved; i++) {
            pool.poll();
          }
        }
      }
    }, validationInterval, validationInterval, TimeUnit.SECONDS);
  }

}
