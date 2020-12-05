package com.yyc.learnleetcode.learnalgorithms.a1470;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shuffle() {
        int[] initArray = {2,5,1,3,4,7};
        int n = 3;
        Solution solution = new Solution();
        int[] actual = solution.shuffle(initArray, n);
        int[] excepted = {2,3,5,4,1,7};
        assertArrayEquals(excepted, actual);
    }

    @Test
    void test1() {
        int[] initArray = {2,5,1,3,4,7};
        System.out.println(initArray[0]);
    }
}