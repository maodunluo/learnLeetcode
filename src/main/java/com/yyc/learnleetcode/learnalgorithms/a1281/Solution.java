package com.yyc.learnleetcode.learnalgorithms.a1281;

/**
 * Subtract the Product and Sum of Digits of an Integer
 *
 * @author yuechao
 */
public class Solution {
    public int subtractProductAndSum(int n) {
        //把各个位的数字取出来，然后进行相乘和相加。
        var product = 1;
        var sum = 0;
        while(n > 0) {
            int i = n % 10;
            sum += i;
            product *= i;
            n = n / 10;
        }
        return product - sum;
    }
}
