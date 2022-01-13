package com.yyc.learnleetcode.learnalgorithms.a83;

/**
 * 83. Remove Duplicates from Sorted List
 *
 * @author yuechao
 */
public class Solution {

  public ListNode deleteDuplicates(ListNode head) {
    ListNode dummy = new ListNode(-101);
    dummy.next = head;
    ListNode pre = dummy;
    ListNode cur = head;
    while(cur != null) {
      if (cur.val == pre.val) {
        pre.next = cur.next;
      } else {
        pre = cur;
      }
      cur = cur.next;
    }
    return dummy.next;
  }

}
