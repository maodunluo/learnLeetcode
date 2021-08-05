package com.yyc.learnleetcode.learnalgorithms.a1047;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 1047. Remove All Adjacent Duplicates In String
 *
 * @author yuechao
 */
class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> deque = new LinkedList<>();
        for (var i = 0; i < s.length(); i++) {
            if (deque.peekLast() != null) {
                if (s.charAt(i) == deque.peekLast()) {
                    deque.pollLast();
                } else {
                    deque.add(s.charAt(i));
                }
            } else {
                deque.add(s.charAt(i));
            }
        }
        var result = new StringBuilder();
        for (Character character : deque) {
            result.append(character);
        }
        return result.toString();
    }
}
