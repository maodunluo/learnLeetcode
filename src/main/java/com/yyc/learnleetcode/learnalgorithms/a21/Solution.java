package com.yyc.learnleetcode.learnalgorithms.a21;

/**
 * 21. Merge Two Sorted Lists
 *
 * @author yuechao
 */
public class Solution {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    final ListNode head = new ListNode(-1);
    ListNode cur = head;
    while(list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        cur.next = list1;
        cur = cur.next;
        list1 = list1.next;
      } else {
        cur.next = list2;
        cur = cur.next;
        list2 = list2.next;
      }
    }
    if (list1 != null) {
      cur.next = list1;
    }
    if (list2 != null) {
      cur.next = list2;
    }
    return head.next;
  }


  public int[] mergeTwoArrays(int[] array1, int[] array2) {
    int[] result = new int[array1.length + array2.length];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i <= array1.length && j <= array2.length) {
      if (array1[i] <= array2[j]) {
        result[k++] = array1[i++];
      } else {
        result[k++] = array2[j++];
      }
    }
    while (i <= array1.length) {
      result[k++] = array1[i++];
    }
    while(j <= array2.length) {
      result[k++] = array2[j++];
    }
    return result;
  }
}
