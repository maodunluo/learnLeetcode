package com.yyc.learnLeetcode.learnAlgorithms.a1374;

/**
 * @author yuechao
 */
public class Solution {
    public String generateTheString(int n) {
        StringBuilder builder = new StringBuilder();
        int count = n;
        for(int i =0; i < count; i++) {
            builder.append("a");
        }
        if(count % 2 == 0){
            builder.setCharAt(count - 1, 'b');
        }
        return builder.toString();
    }
}
