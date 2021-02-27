package com.yyc.learnleetcode.learnalgorithms.a344;

/**
 * 344. Reverse String
 *
 * @author yuechao
 */
public class Solution {
  public char[] reverseString(char[] s) {
    int length = s.length;
    char temp;
    for (int i = 0; i < length / 2; i++) {
      temp = s[i];
      s[i] = s[length - 1 -i];
      s[length - 1 -i] = temp;
    }
    return s;
  }
}
