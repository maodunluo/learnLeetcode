package com.yyc.learnleetcode.learnalgorithms.a1721;

/**
 * 1721. Swapping Nodes in a Linked List
 *
 * @author yuechao
 */
public class Solution {

  public ListNode swapNodes(ListNode head, int k) {
    ListNode fast = head;
    ListNode node = head;
    ListNode slow = head;
    int count = 1;
    while (fast.next != null) {
      if (count < k) {
        node = node.next;
        count++;
      } else {
        slow = slow.next;
      }
      fast = fast.next;
    }
    int temp = node.val;
    node.val = slow.val;
    slow.val = temp;
    return head;
  }
}
