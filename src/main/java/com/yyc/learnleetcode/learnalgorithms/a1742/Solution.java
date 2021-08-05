package com.yyc.learnleetcode.learnalgorithms.a1742;

/**
 * 1742. Maximum Number of Balls in a Box
 *
 * @author yuechao
 */
public class Solution {

    public int countBalls(int lowLimit, int highLimit) {
        //传入一个数，得到其各个位数之和
        var array = new int[46];
        for (int i = lowLimit; i <= highLimit; i++) {
            var sum = 0;
            int flag = i;
            while (flag > 0) {
                int model = flag % 10;
                sum += model;
                flag = flag / 10;
            }
            array[sum]++;
        }
        int max = array[0];
        for (int result : array) {
            if (result > max) {
                max = result;
            }
        }
        return max;
    }
}
