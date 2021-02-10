package com.yyc.learnleetcode.learnalgorithms.a1502;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void canMakeArithmeticProgressionTest() {
        assertTrue(new Solution().canMakeArithmeticProgression(new int[] {3, 5, 1}));
        assertFalse(new Solution().canMakeArithmeticProgression(new int[] {1, 2, 4}));
    }
}