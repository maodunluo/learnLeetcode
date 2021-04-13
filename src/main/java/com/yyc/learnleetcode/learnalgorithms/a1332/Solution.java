package com.yyc.learnleetcode.learnalgorithms.a1332;

/**
 * 1332. Remove Palindromic Subsequences
 *
 * @author yuechao
 */
public class Solution {
  
  private static final int TWO = 2;

  public int removePalindromeSub(String s) {
    if(s == null || "".equals(s)) {
      return 0;
    }
    for(int i = 0; i< (s.length() -1) / TWO; i++) {
      if(s.charAt(i) != (s.charAt(s.length() - 1 -i))) {
        return 2;
      }
    }
    return 1;
  }

}
