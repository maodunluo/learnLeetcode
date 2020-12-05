package com.yyc.learnleetcode.learnalgorithms.a1213;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    List<Integer> result = new ArrayList<>();
    int[] arr1 = {1, 2, 3, 4, 5};
    int[] arr2 = {1, 2, 5, 7, 9};
    int[] arr3 = {1, 3, 4, 5, 8};

    @BeforeEach
    void init() {
        result.add(1);
        result.add(5);
    }

    @Test
    void arraysIntersection() {
        assertEquals(result, new Solution().arraysIntersection(arr1, arr2, arr3));
        assertEquals(result, new Solution().simpleArraysIntersection(arr1, arr2, arr3));
    }
}