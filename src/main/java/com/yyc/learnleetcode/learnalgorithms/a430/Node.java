package com.yyc.learnleetcode.learnalgorithms.a430;

import java.util.Objects;

/**
 * @author yuechao
 */
public class Node {

  public int val;
  public Node prev;
  public Node next;
  public Node child;

  public Node() {
  }

  public Node(int val, Node prev, Node next, Node child) {
    this.val = val;
    this.prev = prev;
    this.next = next;
    this.child = child;
  }

  public int getVal() {
    return val;
  }

  public void setVal(int val) {
    this.val = val;
  }

  public Node getPrev() {
    return prev;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getChild() {
    return child;
  }

  public void setChild(Node child) {
    this.child = child;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return val == node.val && Objects.equals(prev, node.prev) && Objects.equals(
        next, node.next) && Objects.equals(child, node.child);
  }

  @Override
  public int hashCode() {
    return Objects.hash(val, prev, next, child);
  }
}
