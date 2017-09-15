package com.lcleite.github.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leandro on 19/08/17.
 */
public class FlyweightFactory {

  private Map<Integer, Flyweight> cache;

  public FlyweightFactory() {
    cache = new HashMap<>();
  }

  public Flyweight getFlyweight(int id){
    if(cache.containsKey(id)){
      return cache.get(id);
    }
    else{
      Flyweight flyweight = new Flyweight(id);
      cache.put(id, flyweight);

      return flyweight;
    }
  }
}
