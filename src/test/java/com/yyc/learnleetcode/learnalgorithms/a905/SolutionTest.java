package com.yyc.learnleetcode.learnalgorithms.a905;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] input = new int[]{3, 1, 2, 4};
    int[] expected = new int[]{2, 4, 3, 1};

    @Test
    void sortArrayByParity() {
        assertArrayEquals(expected, new Solution().sortArrayByParity(input));
    }

    @Test
    void simpleSortArrayByParity() {
        assertArrayEquals(expected, new Solution().simpleSortArrayByParity(input));
    }
}