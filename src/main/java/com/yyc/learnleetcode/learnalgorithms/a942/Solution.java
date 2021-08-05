package com.yyc.learnleetcode.learnalgorithms.a942;

/**
 * @author yuechao
 */
public class Solution {
    /**
     * 这个方法没有比较i和d，而是比较i和下一个i，d和下一个d，当时我的思路是比较d和i，没办法实现
     *
     * @param input 字符串
     * @return 处理过后的数组
     */
    public int[] diStringMatch(String input) {
        int n = input.length();
        var left = 0;
        int right = n;
        var result = new int[n + 1];
        for (var i = 0; i < n; i++) {
            result[i] = (input.charAt(i) == 'I' ? left++ : right--);
        }
        result[n] = left;
        return result;
    }
}
