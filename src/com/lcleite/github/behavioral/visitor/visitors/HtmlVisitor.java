package com.lcleite.github.behavioral.visitor.visitors;

import com.lcleite.github.behavioral.visitor.Visitor;
import com.lcleite.github.behavioral.visitor.visitables.BoldText;
import com.lcleite.github.behavioral.visitor.visitables.Hyperlink;
import com.lcleite.github.behavioral.visitor.visitables.Paragraph;

/**
 * Created by leandro on 18/09/17.
 */
public class HtmlVisitor extends Visitor {

  public HtmlVisitor() {
    super();
  }

  public void visit(BoldText visitable){
    this.content += "<b>" + visitable.getText() + "</b>";
  }

  public void visit(Hyperlink visitable){
    this.content += "<a href=\'" + visitable.getUrl() + "\'>" + visitable.getText() + "</a>";
  }

  public void visit(Paragraph visitable){
    this.content += "<p>" + visitable.getText() + "</p>";
  }
}
