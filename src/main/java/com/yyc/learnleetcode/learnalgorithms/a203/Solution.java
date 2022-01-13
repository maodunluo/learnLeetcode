package com.yyc.learnleetcode.learnalgorithms.a203;

/**
 * 203. Remove Linked List Elements
 *
 * @author yuechao
 */
public class Solution {

  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return head;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode cur = head;
    ListNode pre = dummy;
    while (cur != null) {
      if (cur.val == val) {
        pre.next = cur.next;
      } else {
        pre = cur;
      }
      cur = cur.next;
    }
    return dummy.next;
  }

}
