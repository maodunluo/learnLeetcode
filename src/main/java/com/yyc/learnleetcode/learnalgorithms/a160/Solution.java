package com.yyc.learnleetcode.learnalgorithms.a160;

/**
 * 160. Intersection of Two Linked Lists
 *
 * @author yuechao
 */
public class Solution {

  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode cur = headA;
    while(cur.next != null) {
      cur = cur.next;
    }
    cur.next = headB;
    ListNode result = detectCycle(headA);
    cur.next = null;
    return result;
  }

  public ListNode detectCycle(ListNode head) {
    if(head == null) {
      return head;
    }
    ListNode fast = head;
    ListNode slow = head;
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (fast == slow) {
        ListNode slow2 = head;
        while(slow != slow2) {
          slow = slow.next;
          slow2 = slow2.next;
        }
        return slow;
      }
    }
    return null;
  }

}
