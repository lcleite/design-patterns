package com.lcleite.github.creational.singleton;

/**
 * Created by leandro on 14/09/17.
 */
public final class Singleton {

  private static Singleton instance;
  private int value;

  private Singleton() {
    this.value = 0;
  }

  public static Singleton getInstance() {
    if (instance == null) {
      instance = new Singleton();
    }
    return instance;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
}
