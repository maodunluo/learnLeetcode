package com.yyc.learnleetcode.learnalgorithms.a1512;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    @DisplayName("Number of Good Pairs")
    void test1() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,1,1,3};
        int excepted = 4;
        int actual = solution.numIdenticalPairs(nums);
        assertEquals(excepted, actual);
    }

}