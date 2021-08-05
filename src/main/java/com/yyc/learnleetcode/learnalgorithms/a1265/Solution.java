package com.yyc.learnleetcode.learnalgorithms.a1265;

/**
 * 1265. Print Immutable Linked List in Reverse
 *
 * @author admin
 */
public class Solution {
  public void printLinkedListInReverse(ImmutableListNode head) {
    if (head != null) {
      printLinkedListInReverse(head.getNext());
      head.printValue();
    }
  }
}
