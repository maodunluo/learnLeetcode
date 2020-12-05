package com.yyc.learnleetcode.learnalgorithms.a1365;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void smallerNumbersThanCurrent() {
        Solution solution = new Solution();
        int[] nums = {8,1,2,2,3};
        int[] excepted  = {4,0,1,1,3};
        final long startTime1 = System.currentTimeMillis();
        assertArrayEquals(excepted, solution.smallerNumbersThanCurrent(nums));
        final long endTime1 = System.currentTimeMillis();
        System.out.println("the first method spends " + (endTime1 - startTime1) + " mills");

        final long startTime2 = System.currentTimeMillis();
        assertArrayEquals(excepted, solution.smallerNumbersThanCurrent2(nums));
        final long endTime2 = System.currentTimeMillis();
        System.out.println("the second method spends " + (endTime2 - startTime2) + " mills");
    }
}