package com.lcleite.github.behavioral.observer;

/**
 * Created by leandro on 14/09/17.
 */
public abstract class Observer {
  protected ObservableNumber number;
  protected String value;

  public abstract void update();

  public String getValue(){
    return value;
  }
}
