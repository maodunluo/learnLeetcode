package com.yyc.learnleetcode.learnalgorithms.a557;


/**
 * 557. Reverse Words in a String III
 *
 * @author yuechao
 */
public class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            builder.append(new StringBuilder(word).reverse().append(" "));
        }
        return builder.toString().trim();
    }
}
