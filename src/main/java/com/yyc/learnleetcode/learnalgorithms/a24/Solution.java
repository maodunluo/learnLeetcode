package com.yyc.learnleetcode.learnalgorithms.a24;

/**
 * 24. Swap Nodes in Pairs
 *
 * @author yuechao
 */
public class Solution {


  /**
   * 这个方法是从前往后处理
   *
   * @param head 头节点
   * @return 处理后的头节点
   */
  public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode pre = dummy;
    while (pre.next != null && pre.next.next != null) {
      ListNode cur = pre.next;
      ListNode next = cur.next;
      pre.next = next;
      cur.next = next.next;
      next.next = cur;
      pre = pre.next.next;
    }
    return dummy.next;
  }

  /**
   * 这个方法是递归从后往前处理
   *
   * @param head 头节点
   * @return 处理后的头节点
   */
  public ListNode swapPairsUseRecursion(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }
    ListNode rest = swapPairsUseRecursion(head.next.next);
    ListNode next = head.next;
    next.next = head;
    head.next = rest;
    return next;
  }

  /**
   * 举一反三 用递归法实现三个为一组进行调换
   *
   * @param head 头节点
   * @return 处理后的头节点
   */
  public ListNode swapThreeNodes(ListNode head) {
    if (head == null || head.next == null || head.next.next == null) {
      return head;
    }
    ListNode node4 = swapThreeNodes(head.next.next.next);
    ListNode node3 = head.next.next;
    ListNode node2 = head.next;
    node3.next = node2;
    node2.next = head;
    head.next = node4;
    return node3;
  }

}
