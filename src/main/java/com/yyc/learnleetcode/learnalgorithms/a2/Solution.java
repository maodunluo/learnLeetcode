package com.yyc.learnleetcode.learnalgorithms.a2;

/**
 * 2. Add Two Numbers
 *
 * @author yuechao
 */
public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(-1);
    ListNode cur = head;
    ListNode pre = new ListNode(0);
    while (l1 != null && l2 != null) {
      var sum = l1.val + l2.val + pre.val;
      pre.val = 0;
      cur.next = l1;
      cur = cur.next;
      if (sum > 9) {
        cur.val = sum - 10;
        pre.val = 1;
      } else {
        cur.val = sum;
      }
      l1 = l1.next;
      l2 = l2.next;
    }
    while (l1 != null) {
      var sum = l1.val + pre.val;
      pre.val = 0;
      cur.next = l1;
      cur = cur.next;
      if (sum > 9) {
        cur.val = sum - 10;
        pre.val = 1;
      } else {
        cur.val = sum;
      }
      l1 = l1.next;
    }
    while (l2 != null) {
      var sum = l2.val + pre.val;
      pre.val = 0;
      cur.next = l2;
      cur = cur.next;
      if (sum > 9) {
        cur.val = sum - 10;
        pre.val = 1;
      } else {
        cur.val = sum;
      }
      l2 = l2.next;
    }
    if (pre.val == 1) {
      cur.next = new ListNode(1);
    }
    return head.next;
  }

  public ListNode addTwoNumbersSimple(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(-1);
    ListNode cur = head;
    int carry = 0;
    int sum;
    while(l1 != null || l2 != null) {
      sum = 0;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      sum += carry;
      int nodeVal = sum % 10;
      carry = sum / 10;
      cur.next = new ListNode(nodeVal);
      cur = cur.next;
    }
    if (carry != 0) {
      cur.next = new ListNode(carry);
    }
    return head.next;
  }

}
