package com.yyc.learnleetcode.learnalgorithms.a22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 22. Generate Parentheses
 *
 * @author yuechao
 */
public class Solution {

  Map<Integer, List<String>> cache = new HashMap<>();

  public List<String> generateParenthesis(int n) {
    if (cache.containsKey(n)) {
      return cache.get(n);
    }
    if (n < 1) {
      List<String> result = new ArrayList<>();
      cache.put(n, result);
      return result;
    }
    if (n == 1) {
      List<String> result = new ArrayList<>(Collections.singletonList("()"));
      cache.put(n, result);
      return result;
    }
    List<String> stringList = generateParenthesis(n - 1);
    Set<String> set = new HashSet<>();
    for (String s : stringList) {
      set.add("(" + s + ")");
    }
    for (int i = 1; i < n; i++) {
      List<String> stringList1 = generateParenthesis(i);
      List<String> stringList2 = generateParenthesis(n - i);
      for (String s1 : stringList1) {
        for (String s2 : stringList2) {
          set.add(s1 + s2);
        }
      }
    }
    List<String> result = new ArrayList<>(set);
    cache.put(n, result);
    return result;
  }

}
