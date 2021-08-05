package com.yyc.learnleetcode.learnalgorithms.a1822;

/**
 * 1822. Sign of the Product of an Array
 *
 * @author yuechao
 */
public class Solution {

  public int arraySign(int[] nums) {
    var result = 0;
    final var TWO = 2;
    for (int num : nums) {
      if (num == 0) {
        return 0;
      } else if (num < 0) {
        result++;
      }
    }
    if (result % TWO == 1) {
      return -1;
    } else {
      return 1;
    }

  }
}
