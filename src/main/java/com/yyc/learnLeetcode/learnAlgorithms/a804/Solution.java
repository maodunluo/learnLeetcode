package com.yyc.learnLeetcode.learnAlgorithms.a804;

import java.util.HashSet;

/**
 * Unique Morse Code Words，第一次用的是枚举类，但是应该怎么调用？
 * 换一个思路，用hashSet
 *
 * @author yuechao
 */
public class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                builder.append(morse[word.charAt(i) - 'a']);
            }
            set.add(builder.toString());
        }
        return set.size();
    }
}
