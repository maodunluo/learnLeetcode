package com.yyc.learnleetcode.learnalgorithms.a206;


/**
 * 206. Reverse Linked List
 *
 * @author yuechao
 */
public class Solution {

  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode cur = head;
    ListNode pre = null;
    while(cur != null) {
      ListNode next = cur.next;
      cur.next = pre;
      pre = cur;
      cur = next;
    }
    return pre;
  }
}
