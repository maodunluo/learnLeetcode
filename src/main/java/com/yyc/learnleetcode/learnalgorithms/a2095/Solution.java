package com.yyc.learnleetcode.learnalgorithms.a2095;

/**
 * 2095. Delete the Middle Node of a Linked List
 *
 * @author yuechao
 */
public class Solution {
  public ListNode deleteMiddle(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode pre = dummy;
    ListNode cur = head;
    ListNode fast = head;
    while(fast != null && fast.next != null) {
      pre = cur;
      cur = cur.next;
      fast = fast.next.next;
    }
    pre.next = cur.next;
    return dummy.next;
  }

}
