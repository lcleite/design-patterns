package com.lcleite.github.structural.adapter;

/**
 * Created by leandro on 19/08/17.
 */
public class Adapter extends Target{

  private Adaptee adaptee;

  public Adapter(Adaptee adaptee){
    this.adaptee = adaptee;
  }

  @Override
  public String targetMethod(String arg1, String arg2) {
    return this.adaptee.incompatibleMethod(arg1+arg2);
  }
}
