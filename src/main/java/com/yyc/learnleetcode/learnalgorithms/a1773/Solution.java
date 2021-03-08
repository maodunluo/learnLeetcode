package com.yyc.learnleetcode.learnalgorithms.a1773;

import java.util.List;

/**
 * 1773. Count Items Matching a Rule
 *
 * @author yuechao
 */
public class Solution {

  public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int index;
    switch (ruleKey) {
      case "type":
        index = 0;
        break;
      case "color":
        index = 1;
        break;
      case "name":
        index = 2;
        break;
      default:
        index = 3;
    }
    int result = 0;
    for (List<String> item : items) {
      if (ruleValue.equals(item.get(index))) {
        result++;
      }
    }
    return result;
  }
}
