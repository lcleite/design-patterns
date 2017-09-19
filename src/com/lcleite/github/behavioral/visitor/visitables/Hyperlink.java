package com.lcleite.github.behavioral.visitor.visitables;

import com.lcleite.github.behavioral.visitor.Visitable;
import com.lcleite.github.behavioral.visitor.Visitor;

/**
 * Created by leandro on 18/09/17.
 */
public class Hyperlink extends Visitable {

  private String url;

  public Hyperlink(String text, String url){
    this.text = text;
    this.url = url;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
