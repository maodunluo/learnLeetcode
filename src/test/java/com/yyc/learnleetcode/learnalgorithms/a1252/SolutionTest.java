package com.yyc.learnleetcode.learnalgorithms.a1252;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void oddCells() {
        Solution solution = new Solution();
        int[][] init = new int[][]{{0, 1}, {1, 1}};
        assertEquals(6, solution.oddCells2(2, 3, init));
    }
}