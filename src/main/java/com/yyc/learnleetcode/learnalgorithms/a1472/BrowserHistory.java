package com.yyc.learnleetcode.learnalgorithms.a1472;

import java.util.Objects;

/**
 * 1472. Design Browser History
 *
 * @author yuechao
 */
public class BrowserHistory {

  static class Node {
    private String val;
    private Node pre;
    private Node next;

    public Node(String val) {
      this.val = val;
    }

    public Node(String val, Node pre,
        Node next) {
      this.val = val;
      this.pre = pre;
      this.next = next;
    }

    public String getVal() {
      return val;
    }

    public void setVal(String val) {
      this.val = val;
    }

    public Node getPre() {
      return pre;
    }

    public void setPre(Node pre) {
      this.pre = pre;
    }

    public Node getNext() {
      return next;
    }

    public void setNext(Node next) {
      this.next = next;
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
      return Objects.equals(val, node.val) && Objects.equals(pre, node.pre)
          && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
      return Objects.hash(val, pre, next);
    }
  }

  private Node cur;

  private Node head;

  public BrowserHistory(String homepage) {
    head = new Node(homepage, null, null);
    cur = head;
  }

  public void visit(String url) {
    cur.next = new Node(url, cur, null);
    cur = cur.next;
  }

  public String back(int steps) {
    while (steps > 0 && cur.pre != null) {
      cur = cur.pre;
      steps--;
    }
    return cur.val;
  }

  public String forward(int steps) {
    while (steps > 0 && cur.next != null) {
      cur = cur.next;
      steps--;
    }
    return cur.val;
  }

}
