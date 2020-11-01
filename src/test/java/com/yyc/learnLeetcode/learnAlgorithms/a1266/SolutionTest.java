package com.yyc.learnLeetcode.learnAlgorithms.a1266;

import org.junit.jupiter.api.Test;

import java.net.Socket;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minTimeToVisitAllPoints() {
        Solution solution = new Solution();
        int[][] points = new int[][]{{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(points.length);
        System.out.println(points[0].length);
        assertEquals(7, solution.minTimeToVisitAllPoints(points));
    }
}