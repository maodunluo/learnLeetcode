package com.yyc.learnLeetcode.learnAlgorithms.a1534;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countGoodTriplets() {
        Solution solution = new Solution();
        assertEquals(0, solution.countGoodTriplets(new int[]{1,1,2,2,3}, 0, 0, 1));
    }
}