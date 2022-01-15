package com.yyc.learnleetcode.learnalgorithms.a1669;

/**
 * 1669. Merge In Between Linked Lists
 *
 * @author yuechao
 */
public class Solution {

  public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    ListNode dummy = new ListNode(-1);
    dummy.next = list1;
    ListNode fast = list1;
    ListNode slow = list1;
    ListNode pre = dummy;
    int index = 0;
    while (index < b) {
      fast = fast.next;
      if (index < a) {
        pre = slow;
        slow = slow.next;
      }
      index++;
    }
    ListNode list2Cur = list2;
    pre.next = list2Cur;
    while (list2Cur.next != null) {
      list2Cur = list2Cur.next;
    }
    list2Cur.next = fast.next;

    return dummy.next;
  }

}
