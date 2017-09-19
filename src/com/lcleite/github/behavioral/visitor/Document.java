package com.lcleite.github.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leandro on 18/09/17.
 */
public class Document {

  private List<Visitable> elements;

  public Document() {
    this.elements = new ArrayList<>();
  }

  public void addVisitableElement(Visitable visitable){
    this.elements.add(visitable);
  }

  public void accept(Visitor visitor){
    for(Visitable element : elements){
      element.accept(visitor);
    }
  }

}
