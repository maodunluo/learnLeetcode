package com.yyc.learnleetcode.learnalgorithms.a1475;

/**
 * @author yuechao
 */
public class Solution {
    public int[] finalPrices(int[] prices) {
        var result = new int[prices.length];
        for (var i = 0; i < prices.length - 1; i++) {
            result[i] = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        result[prices.length - 1] = prices[prices.length - 1];
        return result;
    }
}
