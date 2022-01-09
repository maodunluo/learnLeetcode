package com.yyc.learnleetcode.learnalgorithms.a19;

/**
 * 19. Remove Nth Node From End of List
 *
 * @author yuechao
 */
public class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    // 快慢指针
    if (head == null) {
      return null;
    }
    ListNode fast = head;
    ListNode virtualHead = new ListNode(-1);
    virtualHead.next = head;
    while (n-- > 0 && fast != null) {
      fast = fast.next;
    }
    ListNode slow = head;
    ListNode pre = virtualHead;
    while (fast != null) {
      fast = fast.next;
      pre = slow;
      slow = slow.next;
    }
    pre.next = slow.next;
    return virtualHead.next;
  }
}
