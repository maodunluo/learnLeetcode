package com.yyc.learnleetcode.learnalgorithms.a1480;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 * 目前还没有仔细看mock对象。先凑合写测试用例
 */
class SolutionTest {
    @Test
    @DisplayName("Running Sum of 1d Array")
    public void test1() {
        int[] sums = {1, 2, 3, 4};
        Solution solution = new Solution();
        int[] results = solution.runningSum(sums);
        int[] expected = {1, 3, 6, 10};
        assertArrayEquals(expected, results);
    }
}