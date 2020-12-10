package com.yyc.learnleetcode.learnalgorithms.a977;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] input;
    int[] expected;

    @BeforeEach
    void init() {
        input = new int[]{-4,-1,0,3,10};
        expected = new int[]{0,1,9,16,100};
    }

    @Test
    void sortedSquares() {
        assertArrayEquals(expected, new Solution().sortedSquares(input));
    }
}