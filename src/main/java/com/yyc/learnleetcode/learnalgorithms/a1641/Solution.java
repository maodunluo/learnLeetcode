package com.yyc.learnleetcode.learnalgorithms.a1641;

import java.util.Arrays;

/**
 * 1641. Count Sorted Vowel Strings
 *
 * @author yuechao
 */
public class Solution {

  int[][] cache = new int[51][5];

  public int countVowelStrings(int n) {
    Arrays.fill(cache[0], 1);
    for (int i = 0; i < n; i++) {
      cache[i][0] = 1;
    }
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j < cache[i].length; j++) {
        cache[i][j] = cache[i][j - 1] + cache[i - 1][j];
      }
    }
    int result = 0;
    for (int i = 0; i < 5; i++) {
      result += cache[n - 1][i];
    }
    return result;
  }


}
