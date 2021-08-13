package com.yyc.learnleetcode.learnalgorithms.a20;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 20. Valid Parentheses
 *
 * @author yuechao
 */
public class Solution {

  public boolean isValid(String s) {
    Deque<Character> queue = new ArrayDeque<>();
    queue.add(s.charAt(0));
    for (int i = 1; i < s.length(); i++) {
      if (queue.isEmpty()) {
        queue.add(s.charAt(i));
        continue;
      }
      if (queue.getLast() == '(' && s.charAt(i) == ')') {
        queue.pollLast();
      } else if (queue.getLast() == '{' && s.charAt(i) == '}'){
        queue.pollLast();
      } else if (queue.getLast() == '[' && s.charAt(i) == ']') {
        queue.pollLast();
      } else {
        queue.add(s.charAt(i));
      }
    }
    return queue.isEmpty();
  }
}
