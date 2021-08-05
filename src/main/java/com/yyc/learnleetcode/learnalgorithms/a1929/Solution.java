package com.yyc.learnleetcode.learnalgorithms.a1929;

/**
 * 1929. Concatenation of Array
 *
 * @author yuechao
 */
public class Solution {

  public int[] getConcatenation(int[] nums) {
    var result = new int[nums.length * 2];
    for (var i = 0; i < nums.length; i++) {
      result[i] = nums[i];
      result[i + nums.length] = nums[i];
    }
    return result;
  }

}
