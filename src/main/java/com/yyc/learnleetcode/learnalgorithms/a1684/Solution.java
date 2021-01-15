package com.yyc.learnleetcode.learnalgorithms.a1684;

import java.util.HashSet;
import java.util.Set;

/**
 * 1684. Count the Number of Consistent Strings
 *
 * @author yuechao
 */
public class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int result = 0;
        for (String word: words) {
            char[] chars = word.toCharArray();
            Set<Character> charSet = new HashSet<>();
            for (char aChar : chars) {
                charSet.add(aChar);
            }
            int size = charSet.size();
            int count = 0;
            for (char c : charSet) {
                if (!allowed.contains(String.valueOf(c))) {
                    break;
                }
                count++;
            }
            if (size == count) {
                result++;
            }
        }
        return result;
    }
}
