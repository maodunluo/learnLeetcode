package com.yyc.learnleetcode.learnalgorithms.a503;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 503. Next Greater Element II
 *
 * @author yuechao
 */
public class Solution {
  public int[] nextGreaterElements(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      Deque<Integer> stack = new ArrayDeque<>();
      result[i] = -1;
      for (int j = i+1; j < nums.length; j++) {
        if (nums[j] > nums[i]) {
          stack.push(nums[j]);
          break;
        }
      }
      if (!stack.isEmpty()) {
        result[i] = stack.peek();
        continue;
      }
      for (int j = 0; j < i; j++) {
        if (nums[j] > nums[i]) {
          stack.push(nums[j]);
          break;
        }
      }
      if (!stack.isEmpty()) {
        result[i] = stack.peek();
      }
    }
    return result;
  }
}
