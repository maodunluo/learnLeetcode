package com.yyc.learnleetcode.learnalgorithms.a382;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 382. Linked List Random Node
 *
 * @author yuechao
 */
public class Solution {

  List<Integer> list;

  public Solution(ListNode head) {
    list = new ArrayList<>();
    while (head != null) {
      list.add(head.val);
      head = head.next;
    }
  }

  public int getRandom() {
    return list.get(new Random().nextInt(list.size()));
  }

}
