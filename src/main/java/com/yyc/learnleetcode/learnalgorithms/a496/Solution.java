package com.yyc.learnleetcode.learnalgorithms.a496;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 496. Next Greater Element I
 *
 * @author yuechao
 */
public class Solution {

  public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      int index = 0;
      for (int j = 0; j < nums2.length; j++) {
        if (nums1[i] == nums2[j]) {
          index = j;
          break;
        }
      }
      int value = -1;
      for (int k = index; k < nums2.length; k++) {
        if (nums2[k] > nums1[i]) {
          value = nums2[k];
          break;
        }
      }
      result[i] = value;
    }
    return result;
  }

  public int[] nextGreaterElement2(int[] nums1, int[] nums2) {
    int[] result = new int[nums1.length];
    for (int i = 0; i < nums1.length; i++) {
      Deque<Integer> stack = new ArrayDeque<>();
      for (int j = nums2.length; nums2[j - 1] != nums1[i]; j--) {
        if (nums2[j - 1] > nums1[i]) {
          stack.push(nums2[j - 1]);
        }
      }
      if (stack.isEmpty()) {
        result[i] = -1;
      } else {
        result[i] = stack.peek();
      }
    }
    return result;
  }

}
