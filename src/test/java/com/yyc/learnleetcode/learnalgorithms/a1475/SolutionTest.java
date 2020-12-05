package com.yyc.learnleetcode.learnalgorithms.a1475;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] input = new int[]{8,4,6,2,3};
    int[] expected = new int[]{4,2,4,2,3};
    @Test
    void finalPrices() {
        assertArrayEquals(expected, new Solution().finalPrices(input));
    }
}