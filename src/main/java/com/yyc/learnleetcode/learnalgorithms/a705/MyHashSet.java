package com.yyc.learnleetcode.learnalgorithms.a705;

import java.util.LinkedList;
import java.util.List;

/**
 * 705. Design HashSet
 *
 * @author yuechao
 */
public class MyHashSet {

  List<Integer> linkedList;

  public MyHashSet() {
    linkedList = new LinkedList<>();
  }

  public void add(int key) {
    if (linkedList.contains(key)) {
      return;
    }
    linkedList.add(key);
  }

  public void remove(int key) {
    if (linkedList.contains(key)) {
      linkedList.remove(linkedList.indexOf(key));
    }
  }

  public boolean contains(int key) {
    return linkedList.contains(key);
  }

}
