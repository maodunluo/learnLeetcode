package com.yyc.learnleetcode.learnalgorithms.a121;

/**
 * 121. Best Time to Buy and Sell Stock
 * 找出最小的元素，然后找出下标在其后面的最大的元素。思路错了，应该找最小成本和最大的利润，而不是最小值最大值。
 *
 * @author yuechao
 */
public class Solution {

  public int maxProfit(int[] prices) {
    int min = prices[0];
    int maxProfit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (min > prices[i]) {
        min = prices[i];
      } else if (prices[i] - min > maxProfit) {
        maxProfit = prices[i] - min;
      }
    }
    return maxProfit;
  }
}
