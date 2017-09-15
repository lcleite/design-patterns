package com.lcleite.github.behavioral.observer;

/**
 * Created by leandro on 14/09/17.
 */
public class HexObserver extends Observer {

  public HexObserver(ObservableNumber number) {
    this.number = number;
    this.number.addObserver(this);
    this.update();
  }

  public void update() {
    this.value = Integer.toHexString(number.getValue());
  }
}