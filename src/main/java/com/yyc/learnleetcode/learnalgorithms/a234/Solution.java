package com.yyc.learnleetcode.learnalgorithms.a234;

/**
 * 234. Palindrome Linked List
 *
 * @author yuechao
 */
public class Solution {

  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return false;
    }
    ListNode fast = head;
    ListNode slow = head;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
    }
    ListNode reverse = reverse(slow);
    while(reverse != null) {
      if (reverse.val != head.val) {
        return false;
      }
      reverse = reverse.next;
      head = head.next;
    }
    return true;
  }

  private ListNode reverse(ListNode head) {
    ListNode result = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = result;
      result = head;
      head = next;
    }
    return result;
  }
}
