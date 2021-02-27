package com.yyc.learnleetcode.learnalgorithms.a344;

/**
 * 344. Reverse String
 *
 * @author yuechao
 */
public class Solution {

  private static final int TWO = 2;
  public char[] reverseString(char[] s) {
    int length = s.length;
    char temp;
    for (int i = 0; i < length / TWO; i++) {
      temp = s[i];
      s[i] = s[length - 1 -i];
      s[length - 1 -i] = temp;
    }
    return s;
  }

  public char[] reverseStringI(char[] s) {
    int length = s.length;
    for (int i = 0; i < length / TWO; i++) {
      s[i] = (char) (s[i] ^ s[length - 1 - i]);
      s[length - 1 - i] = (char) (s[length - 1 - i] ^ s[i]);
      s[i] = (char) (s[i] ^ s[length - 1 - i]);
    }
    return s;
  }
}
