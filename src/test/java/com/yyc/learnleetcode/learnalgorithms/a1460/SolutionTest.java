package com.yyc.learnleetcode.learnalgorithms.a1460;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] target = new int[]{1,2,3,4};
    int[] arr = new int[]{2,4,1,3};

    @Test
    void canBeEqual() {
        assertTrue(new Solution().canBeEqual(target, arr));
    }

    @Test
    void simpleCanBeEqual() {
        assertTrue(new Solution().simpleCanBeEqual(target, arr));
    }
}