package com.yyc.learnLeetcode.learnAlgorithms.a1588;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sumOddLengthSubarrays() {
        Solution solution = new Solution();
        assertEquals(58, solution.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3}));
    }
}