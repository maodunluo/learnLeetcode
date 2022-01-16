package com.yyc.learnleetcode.learnalgorithms.a382;

import java.util.Random;

/**
 * 382. Linked List Random Node
 *
 * @author yuechao
 */
public class Solution {

  ListNode node;
  int size;

  public Solution(ListNode head) {
    node = head;
    ListNode cur = head;
    size = 0;
    while(cur != null){
      size++;
      cur = cur.next;
    }
  }

  public int getRandom() {
    int i = new Random().nextInt(size);
    ListNode p = this.node;
    while (i > 0) {
      p = p.next;
      i--;
    }
    return p.val;
  }

}
