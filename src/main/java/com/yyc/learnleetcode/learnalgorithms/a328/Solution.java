package com.yyc.learnleetcode.learnalgorithms.a328;

/**
 * 328. Odd Even Linked List
 *
 * @author yuechao
 */
public class Solution {

  public ListNode oddEvenList(ListNode head) {
    if (head == null) {
      return null;
    }
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode odd = head;
    ListNode even = head.next;
    final ListNode sentinel = head.next;
    while(even != null && even.next != null) {
      odd.next = even.next;
      odd = odd.next;
      even.next = odd.next;
      even = even.next;
    }
    odd.next = sentinel;
    return dummy.next;
  }

}
