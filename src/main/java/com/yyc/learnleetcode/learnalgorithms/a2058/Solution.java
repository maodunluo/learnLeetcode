package com.yyc.learnleetcode.learnalgorithms.a2058;

import java.util.ArrayList;
import java.util.List;

/**
 * 2058. Find the Minimum and Maximum Number of Nodes Between Critical Points
 *
 * @author yuechao
 */
public class Solution {

  public int[] nodesBetweenCriticalPoints2(ListNode head) {
    // 需要将最小值保存下来
    ListNode pre = head;
    head = head.next;
    int index = -1;
    int right = 0;
    int left = -1;
    int i = 0;
    int min = Integer.MAX_VALUE;
    while (head.next != null) {
      if ((pre.val < head.val && head.next.val < head.val) || (pre.val > head.val
          && head.next.val > head.val)) {
        if (index == -1) {
          index = i;
          right = i;
          left = i;
        } else {
          left = right;
          right = i;
          if (right - left < min) {
            min = right - left;
          }
        }
      }
      i++;
      pre = head;
      head = head.next;
    }
    if (index == -1 || left == right) {
      return new int[]{-1, -1};
    }
    return new int[]{min, right - index};
  }

  public int[] nodesBetweenCriticalPoints(ListNode head) {
    ListNode pre = head;
    List<Integer> list = new ArrayList<>();
    int index = 1;
    head = head.next;
    while (head != null && head.next != null) {
      if ((pre.val < head.val && head.next.val < head.val) || (pre.val > head.val
          && head.next.val > head.val)) {
        list.add(index);
      }
      head = head.next;
      index += 1;
      pre = pre.next;
    }
    if (list.size() < 2) {
      return new int[]{-1, -1};
    }
    int max = list.get(list.size() - 1) - list.get(0);
    int min = max;
    for (int i = 1; i < list.size(); i++) {

      min = Math.min(min, list.get(i) - list.get(i - 1));
    }
    return new int[]{min, max};

  }

}
