package com.yyc.learnleetcode.learnalgorithms.a1389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void createTargetArray() {
        Solution solution = new Solution();
        int[] except = {0, 4, 1, 3, 2};
        int[] actual = solution.createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});
        assertArrayEquals(except, actual);
    }
}