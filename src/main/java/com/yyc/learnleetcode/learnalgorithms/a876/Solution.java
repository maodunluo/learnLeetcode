package com.yyc.learnleetcode.learnalgorithms.a876;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;

/**
 * 876. Middle of the Linked List
 *
 * @author yuechao
 */
public class Solution {

  public ListNode middleNode(ListNode head) {
    List<ListNode> listNodeList = new ArrayList<>();
    int count = 0;
    while (!ObjectUtils.isEmpty(head)) {
      listNodeList.add(head);
      count++;
      head = head.next;
    }
    return listNodeList.get(count / 2);
  }
}
