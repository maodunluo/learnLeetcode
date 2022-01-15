package com.yyc.learnleetcode.learnalgorithms.a1019;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1019. Next Greater Node In Linked List
 *
 * @author yuechao
 */
public class Solution {

  public int[] nextLargerNodes(ListNode head) {
    ListNode reverse = reverse(head);
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> valueStack = new ArrayDeque<>();
    while (reverse != null) {
      while (!stack.isEmpty() && reverse.val >= stack.peek()) {
        stack.pop();
      }
      if (!stack.isEmpty()) {
        valueStack.push(stack.peek());
      } else {
        valueStack.push(0);
      }
      stack.push(reverse.val);
      reverse = reverse.next;
    }
    final int size = valueStack.size();
    int[] result = new int[size];
    for (int i = 0; i < size; i++) {
      result[i] = valueStack.pop();
    }
    return result;
  }

  private ListNode reverse(ListNode head) {
    ListNode pre = null;
    while (head != null) {
      ListNode next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }
    return pre;
  }


}
