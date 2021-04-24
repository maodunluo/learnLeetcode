package com.yyc.learnleetcode.learnalgorithms.a1832;

/**
 * 1832. Check if the Sentence Is Pangram
 *
 * @author yuechao
 */
public class Solution {

  private static final int CHARACTER_COUNT = 26;

  public boolean checkIfPangram(String sentence) {
    boolean[] countArray = new boolean[CHARACTER_COUNT];
    if (sentence.length() < CHARACTER_COUNT) {
      return false;
    }
    for (char c : sentence.toCharArray()) {
      countArray[c - 'a'] = true;
    }
    for (boolean b : countArray) {
      if (!b) {
        return false;
      }
    }
    return true;
  }
}
