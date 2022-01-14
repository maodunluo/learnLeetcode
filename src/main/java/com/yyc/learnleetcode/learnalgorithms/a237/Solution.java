package com.yyc.learnleetcode.learnalgorithms.a237;

/**
 * 237. Delete Node in a Linked List
 * 好坑啊这题
 *
 * @author yuechao
 */
public class Solution {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }

}
