package com.yyc.learnleetcode.learnalgorithms.a1217;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void minCostToMoveChipsTest() {
        assertEquals(1, new Solution().minCostToMoveChips(new int[]{1, 2, 3}));
        assertEquals(2, new Solution().minCostToMoveChips(new int[]{2, 2, 2, 3, 3}));
        assertEquals(1, new Solution().minCostToMoveChips(new int[]{1, 1000000000}));
    }
}