package com.yyc.learnleetcode.learnalgorithms.a1351;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countNegativesTest() {
        int[][] grid = new int[][]{{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        assertEquals(8, new Solution().countNegatives(grid));
    }

    public int countNegatives(int[][] grid) {
        int result = 0;
        for (int[] row : grid) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] < 0) {
                    result += (row.length - i);
                    break;
                }
            }
        }
        return result;
    }
}