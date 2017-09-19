package com.lcleite.github.behavioral.visitor;

import java.util.List;

/**
 * Created by leandro on 18/09/17.
 */
public abstract class Visitable {

  protected String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public abstract void accept(Visitor visitor);
}
