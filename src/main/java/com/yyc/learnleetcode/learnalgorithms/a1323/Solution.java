package com.yyc.learnleetcode.learnalgorithms.a1323;

/**
 * Maximum 69 Number 感觉好挫啊这代码写的，但是还是比较快的，就是变量太多了，可以参考网上的答案来将其转化为数组然后替换
 *
 * @author yuechao
 */
public class Solution {
    private static final int BASE = 10;
    public int maximum69Number (int num) {
        int digits = 1;
        //flag用来计算位数
        int flag = num;
        //用来计算哪一位是6
        int flag2 = num;
        while (flag / BASE != 0) {
            digits++;
            flag /= 10;
        }
        while (digits != 0) {
            int v = (int)(flag2 / Math.pow(10, digits - 1));
            flag2 -= v * Math.pow(10, digits - 1);
            if (v == 6) {
                num += 3 * Math.pow(10, digits - 1);
                break;
            }
            digits--;
        }
        return num;
    }
}
