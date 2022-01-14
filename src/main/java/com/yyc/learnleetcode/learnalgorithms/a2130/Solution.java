package com.yyc.learnleetcode.learnalgorithms.a2130;

/**
 * 2130. Maximum Twin Sum of a Linked List
 *
 * @author yuechao
 */
public class Solution {

  public int pairSum(ListNode head) {
    ListNode fast = head;
    ListNode slow = head;
    if (head == null) {
      return 0;
    }
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    ListNode node = reverseListNode(slow);
    int max = 0;
    while (node != null) {
      if (max <= (head.val + node.val)) {
        max = (head.val + node.val);
      }
      head = head.next;
      node = node.next;

    }
    return max;
  }

  private ListNode reverseListNode(ListNode slow) {
    ListNode pre = null;
    while (slow != null) {
      ListNode next = slow.next;
      slow.next = pre;
      pre = slow;
      slow = next;
    }
    return pre;
  }


}
