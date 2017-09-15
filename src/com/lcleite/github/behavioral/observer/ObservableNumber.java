package com.lcleite.github.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leandro on 14/09/17.
 */
public class ObservableNumber {
  private List<Observer> observers = new ArrayList<>();
  private int value;

  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
    updateObservers();
  }

  private void updateObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }
}
