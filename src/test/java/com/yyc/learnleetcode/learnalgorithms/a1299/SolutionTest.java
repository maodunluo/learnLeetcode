package com.yyc.learnleetcode.learnalgorithms.a1299;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] input = new int[]{17,18,5,4,6,1};
    int[] expected = new int[]{18,6,6,6,1,-1};

    @Test
    void replaceElements() {
        assertArrayEquals(expected, new Solution().replaceElements(input));
    }
}