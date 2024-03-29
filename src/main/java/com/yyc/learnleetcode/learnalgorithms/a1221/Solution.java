package com.yyc.learnleetcode.learnalgorithms.a1221;

/**
 * 第一次的思路是错误的，不应该统计具体的个数，要用贪婪算法。从局部最优（最小的）开始往外推。参考讨论区的答案
 *
 * @author yuechao
 */
public class Solution {

    public int balancedStringSplit(String s) {
        var cnt = 0;
        var res = 0;
        for (var i = 0; i < s.length(); i++) {
            cnt += s.charAt(i) == 'L' ? 1 : -1;
            if (cnt == 0) {
                res++;
            }
        }
        return res;
    }
}
