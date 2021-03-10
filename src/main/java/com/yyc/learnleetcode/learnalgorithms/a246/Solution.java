package com.yyc.learnleetcode.learnalgorithms.a246;

/**
 * 246. Strobogrammatic Number
 *
 * @author yuechao
 */
public class Solution {

  public boolean isStrobogrammatic(String num) {
    for (int i = 0; i < num.length() / 2 + 1; i++) {
      char symmetryChar = num.charAt(num.length() - i - 1);
      if (num.charAt(i) == '6' && symmetryChar != '9') {
        return false;
      }
      if (num.charAt(i) == '9' && symmetryChar != '6') {
        return false;
      }
      if (num.charAt(i) == '8' && symmetryChar != '8') {
        return false;
      }
      if (num.charAt(i) == '1' && symmetryChar != '1') {
        return false;
      }
      if (num.charAt(i) == '0' && symmetryChar != '0') {
        return false;
      }
      if (num.charAt(i) == '2' || num.charAt(i) == '3'
          || num.charAt(i) == '4'
          || num.charAt(i) == '5'
          || num.charAt(i) == '7') {
        return false;
      }
    }
    return true;
  }
}
