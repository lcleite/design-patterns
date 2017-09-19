package com.lcleite.github.behavioral.visitor;

import com.lcleite.github.behavioral.visitor.visitables.BoldText;
import com.lcleite.github.behavioral.visitor.visitables.Hyperlink;
import com.lcleite.github.behavioral.visitor.visitables.Paragraph;

/**
 * Created by leandro on 18/09/17.
 */
public abstract class Visitor {
  protected String content;

  public Visitor() {
    this.content = "";
  }

  abstract public void visit(BoldText visitable);
  abstract public void visit(Paragraph visitable);
  abstract public void visit(Hyperlink visitable);

  @Override
  public String toString() {
    return content;
  }
}
