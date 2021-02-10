package com.yyc.learnleetcode.learnalgorithms.a912;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    int[] input = new int[4];
    int[] expected = new int[4];

    @BeforeEach
    void init() {
        input = new int[]{5,2,3,1};
        expected = new int[]{1,2,3,5};
    }

    @Test
    @DisplayName("希尔排序")
    void shellSort() {
        assertArrayEquals(expected, new Solution().sortArray(input));
    }

    @Test
    @DisplayName("插入排序")
    void insertionSort() {
        assertArrayEquals(expected, new Solution().insertionSort(input));
    }

    @Test
    @DisplayName("冒泡排序")
    void bobbleSort() {
        assertArrayEquals(expected, new Solution().bobbleSort(input));
    }

    @Test
    @DisplayName("选择排序")
    void selectionSort() {
        assertArrayEquals(expected, new Solution().selectionSort(input));
    }

    @Test
    @DisplayName("归并排序")
    void unionSort() {
        assertArrayEquals(expected, new Solution().unionSort(input));
    }


}