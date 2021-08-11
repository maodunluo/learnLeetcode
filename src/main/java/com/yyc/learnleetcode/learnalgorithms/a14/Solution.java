package com.yyc.learnleetcode.learnalgorithms.a14;

/**
 * 14. Longest Common Prefix
 *
 * @author yuechao
 */
public class Solution {

  public String longestCommonPrefix(String[] strs) {
    int minSize = strs[0].length();
    int minSizeIndex = 0;
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < strs.length; i++) {
      if (minSize > strs[i].length()) {
        minSize = strs[i].length();
        minSizeIndex = i;
      }
    }
    if (strs.length == 1) {
      return strs[0];
    }
    for (int i = 0; i < minSize; i++) {
      for (int j = 0; j < strs.length; j++) {
        if (strs[j].charAt(i) != strs[minSizeIndex].charAt(i)) {
          return result.toString();
        }
        if (j == strs.length - 1) {
          result.append(strs[minSizeIndex].charAt(i));
        }
      }
    }
    return result.toString();
  }

}
