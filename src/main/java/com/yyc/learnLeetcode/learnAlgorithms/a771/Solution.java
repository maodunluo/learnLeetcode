package com.yyc.learnLeetcode.learnAlgorithms.a771;

/**
 * 771. Jewels and Stones
 *
 * @author yuechao
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < J.length(); i++) {
            String c = String.valueOf(J.charAt(i));
            for (int j = 0; j < S.length(); j++) {
                if (c.equals(S.substring(j, j + 1))) {
                    result++;
                }
            }
        }
        return result;
    }
}
