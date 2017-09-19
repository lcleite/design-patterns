package com.lcleite.github.behavioral.visitor.visitables;

import com.lcleite.github.behavioral.visitor.Visitable;
import com.lcleite.github.behavioral.visitor.Visitor;

/**
 * Created by leandro on 18/09/17.
 */
public class Paragraph extends Visitable {

  public Paragraph(String text) {
    this.text = text;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
