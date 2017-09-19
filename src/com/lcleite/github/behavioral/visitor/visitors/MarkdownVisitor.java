package com.lcleite.github.behavioral.visitor.visitors;

import com.lcleite.github.behavioral.visitor.Visitor;
import com.lcleite.github.behavioral.visitor.visitables.BoldText;
import com.lcleite.github.behavioral.visitor.visitables.Hyperlink;
import com.lcleite.github.behavioral.visitor.visitables.Paragraph;

/**
 * Created by leandro on 18/09/17.
 */
public class MarkdownVisitor extends Visitor{

  public void visit(BoldText visitable){
    this.content += "**" + visitable.getText() + "**";
  }

  public void visit(Hyperlink visitable){
    this.content += "[" + visitable.getText() + "]" + "(" + visitable.getUrl() + ")";
  }

  public void visit(Paragraph visitable){
    this.content += visitable.getText();
  }
}
