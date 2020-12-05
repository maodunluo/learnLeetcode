package com.yyc.learnleetcode.learnalgorithms.a1085;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] input = new int[]{34, 23, 1, 24, 75, 33, 54, 8};
    int[] inputCase2 = new int[]{99, 77, 33, 66, 55};

    @Test
    void sumOfDigits() {
        assertEquals(0, new Solution().sumOfDigits(input));
        assertEquals(1, new Solution().sumOfDigits(inputCase2));
    }
}