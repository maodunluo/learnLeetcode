package com.yyc.learnleetcode.learnalgorithms.a121;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void maxProfitTest() {
    assertEquals(5, new Solution().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    assertEquals(0, new Solution().maxProfit(new int[]{7, 6, 4, 3, 1}));
  }

}