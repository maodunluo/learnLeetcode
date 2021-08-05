package com.yyc.learnleetcode.learnalgorithms.a1688;

/**
 * 1688. Count of Matches in Tournament
 *
 * @author yuechao
 */
public class Solution {
    public int numberOfMatches(int n) {
        var result = 0;
        while(n > 1) {
            result += n /2;
            if(n % 2 == 1) {
                n = n / 2 + 1;
            } else {
                n /= 2;
            }
        }
        return result;
    }
}
