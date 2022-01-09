package com.yyc.learnleetcode.learnalgorithms.a23;

/**
 * 23. Merge k Sorted Lists
 *
 * @author yuechao
 */
public class Solution {

  public ListNode mergeKLists(ListNode[] lists) {
    //Runtime: 135 ms 按照顺序比较，faster than 13.51% ，效率低
    if (lists == null) {
      return null;
    }
    ListNode list = lists[0];
    for (int i = 1; i < lists.length; i++) {
      list = mergeTwoLists(list, lists[i]);
    }
    return list;
  }

  public ListNode mergeKLists2(ListNode[] lists) {
    // Runtime: 3 ms, faster than 83.48% 从外向内合并链表
    if (lists == null) {
      return null;
    }
    int rightIndex = lists.length - 1;
    while(rightIndex > 0) {
      int l = 0;
      int r = rightIndex;
      while (l < r) {
        lists[l] = mergeTwoLists(lists[l], lists[r]);
        l++;
        r--;
      }
      rightIndex = r;
    }
    return lists[0];
  }

  private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    final ListNode head = new ListNode(-1);
    ListNode cur = head;
    while(l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        cur.next = l1;
        l1 = l1.next;
        cur = cur.next;
      } else {
        cur.next = l2;
        l2 = l2.next;
        cur = cur.next;
      }
    }
    if (l1 != null) {
      cur.next = l1;
    }
    if (l2 != null) {
      cur.next = l2;
    }
    return head.next;
  }

}
