package com.yyc.learnleetcode.learnalgorithms.a1313;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void decompressRLElist() {
        Solution solution = new Solution();
        int[] nums = {1,2,3,4};
        int[] excepted = {2,4,4,4};
        int[] actual = solution.decompressRLElist(nums);
        int[] actual2 = solution.decompressRLElist2(nums);
        assertArrayEquals(excepted, actual);
        assertArrayEquals(excepted, actual2);

    }
}