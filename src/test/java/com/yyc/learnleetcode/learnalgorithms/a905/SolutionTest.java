package com.yyc.learnleetcode.learnalgorithms.a905;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[] input = new int[]{3, 1, 2, 4};
    int[] expected = new int[]{2, 4, 3, 1};
    //这个是指向数组的引用是final修饰的，这个引用指向了一个地址，这个地址里的内容是可以改变的。
    final int[] finalInput = new int[]{3, 1, 2, 4};

    @Test
    void sortArrayByParity() {
        assertArrayEquals(expected, new Solution().sortArrayByParity(input));
    }

    @Test
    void simpleSortArrayByParity() {
        assertArrayEquals(expected, new Solution().simpleSortArrayByParity(input));
    }

    @Test
    void finalInputTest() {
        assertArrayEquals(expected, new Solution().simpleSortArrayByParity(finalInput));
    }
}