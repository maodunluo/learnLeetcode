package com.yyc.learnleetcode.learnalgorithms.a559;

import java.util.List;

/**
 * @author yuechao
 */
public class Node {

  private int val;
  private List<Node> children;

  public Node() {
  }

  public Node(int val) {
    this.val = val;
  }

  public Node(int val, List<Node> children) {
    this.val = val;
    this.children = children;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public List<Node> getChildren() {
    return children;
  }

  public void setChildren(List<Node> children) {
    this.children = children;
  }
}
