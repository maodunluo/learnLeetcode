package com.yyc.learnleetcode.learnalgorithms.a1816;

/**
 * 1816. Truncate Sentence
 *
 * @author yuechao
 */
public class Solution {

  public String truncateSentence(String s, int k) {
    String[] s1 = s.split(" ");
    var result = new StringBuilder();
    for (var i = 0; i < k; i++) {
      result.append(s1[i]);
      result.append(" ");
    }
    result.deleteCharAt(result.length() - 1);
    return result.toString();
  }
}
