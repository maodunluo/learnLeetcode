package com.yyc.learnleetcode.learnalgorithms.a1689;

/**
 * 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
 *
 * @author yuechao
 */
public class Solution {

  public int minPartitions(String n) {
    var max = '0';
    for (int i = 0; i < n.length(); i++) {
      if (max <= n.charAt(i)) {
        max = n.charAt(i);
      }
    }
    return max - '0';
  }

}
