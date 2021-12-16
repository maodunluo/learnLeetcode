package com.yyc.learnleetcode.learnalgorithms.a1769;

/**
 * 1769. Minimum Number of Operations to Move All Balls to Each Box
 *
 * @author yuechao
 */
public class Solution {

  public int[] minOperations(String boxes) {
    final var array = boxes.toCharArray();
    var result = new int[boxes.length()];
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[j] == '1') {
          result[i] += Math.abs(i - j);
        }
      }
    }
    return result;
  }

}
