package com.yyc.learnLeetcode.learnAlgorithms.a1572;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diagonalSum() {
        Solution solution = new Solution();
        int[][] initArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertEquals(25, solution.diagonalSum(initArray));
    }
}