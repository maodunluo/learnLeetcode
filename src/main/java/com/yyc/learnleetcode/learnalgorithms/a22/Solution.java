package com.yyc.learnleetcode.learnalgorithms.a22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 * 22. Generate Parentheses
 *
 * @author yuechao
 */
public class Solution {

  public List<String> generateParenthesis(int n) {
    Map<Integer, Set<String>> resultMap = new HashMap<>(64);
    resultMap.put(1, Set.of("()"));
    for (int i = 2; i <= n; i++) {
      List<String> stringList = new ArrayList<>(resultMap.get(i - 1));
      Set<String> parenthesisSet = new TreeSet<>();
      for (String s : stringList) {
        // how to improve it
        for (int index = 0; index < s.length(); index++) {
          parenthesisSet.add(s.substring(0, index + 1) + "()" + s.substring(index + 1));
        }
      }
      resultMap.put(i, parenthesisSet);
    }
    return new ArrayList<>(resultMap.get(n));
  }

}
