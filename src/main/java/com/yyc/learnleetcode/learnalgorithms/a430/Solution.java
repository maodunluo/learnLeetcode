package com.yyc.learnleetcode.learnalgorithms.a430;

/**
 * 430. Flatten a Multilevel Doubly Linked List
 * 如何确定递归的入参和出参
 *
 * @author yuechao
 */
public class Solution {

  /**
   * 正向顺序迭代遍历 O(n)
   *
   * @param head 头节点
   * @return result
   */
  public Node flatten(Node head) {
    if (head == null) {
      return null;
    }
    Node dummy = new Node();
    dummy.next = head;
    Node cur = head;
    while (cur != null) {
      if (cur.child != null) {
        Node next = cur.next;
        Node child = cur.child;
        cur.next = cur.child;
        cur.next.prev = cur;
        cur.child = null;
        while (child.next != null) {
          child = child.next;
        }
        child.next = next;
        if (next != null) {
          child.next.prev = child;
        }
      }
      cur = cur.next;
    }
    return dummy.next;
  }

  /**
   * 使用递归来flatten, O(n*n)
   *
   * @param head 头节点
   * @return 处理结果
   */
  public Node flatten2(Node head) {
    if (head == null) {
      return null;
    }
    Node dummy = new Node();
    dummy.next = head;
    while (head != null) {
      if (head.child == null) {
        head = head.next;
      } else {
        Node next = head.next;
        Node cHead = flatten2(head.child);
        head.next = cHead;
        cHead.prev = head;
        head.child = null;
        while (head.next != null) {
          head = head.next;
        }
        head.next = next;
        if (next != null) {
          next.prev = head;
        }
        head = next;
      }
    }
    return dummy.next;
  }

  /**
   * 递归优化 每次出参是child层的最后一个节点 O(n)
   *
   * @param head 头节点
   * @return 处理结果
   */
  public Node flatten3(Node head) {
    dfs(head);
    return head;
  }

  private Node dfs(Node head) {
    Node last = head;
    while (head != null) {
      if (head.child == null) {
        last = head;
        head = head.next;
      } else {
        Node next = head.next;
        Node childLast = dfs(head.child);
        head.next = head.child;
        head.child.prev = head;
        head.child = null;
        if (childLast != null) {
          childLast.next = next;
        }
        if (next != null) {
          next.prev = childLast;
        }
        last = head;
        head = childLast;
      }
    }
    return last;
  }

}
