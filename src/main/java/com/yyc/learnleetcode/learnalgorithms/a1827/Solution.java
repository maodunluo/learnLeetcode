package com.yyc.learnleetcode.learnalgorithms.a1827;

/**
 * 1827. Minimum Operations to Make the Array Increasing
 *
 * @author yuechao
 */
public class Solution {
  public int minOperations(int[] nums) {
    if(nums.length == 1) {
      return 0;
    }
    int current = nums[0];
    var result = 0;
    for(var i = 1; i < nums.length; i++) {
      if(nums[i] <= current) {
        result += (current + 1 - nums[i]);
        current += 1;
        continue;
      }
      current = nums[i];
    }
    return result;
  }
}
