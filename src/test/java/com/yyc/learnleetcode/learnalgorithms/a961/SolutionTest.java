package com.yyc.learnleetcode.learnalgorithms.a961;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void repeatedNTimes() {
        int[] input = new int[]{1,2,3,3};
        assertEquals(3, new Solution().repeatedNTimes(input));
    }

    @Test
    void repeatedNTimesUseMap() {
        int[] input = new int[]{1,2,3,3};
        assertEquals(3, new Solution().repeatedNTimesUseMap(input));
    }

    @Test
    void repeatedNTimesUseArr() {
        int[] input = new int[]{1,2,3,3};
        assertEquals(3, new Solution().repeatedNTimesUseArr(input));
    }
}