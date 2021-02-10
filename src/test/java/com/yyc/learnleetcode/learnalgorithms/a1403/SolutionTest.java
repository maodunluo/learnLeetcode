package com.yyc.learnleetcode.learnalgorithms.a1403;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    List<Integer> expectedList = new ArrayList<>();

    @BeforeEach
    void init() {
        expectedList.add(7);
        expectedList.add(7);
        expectedList.add(6);
    }

    @Test
    void minSubsequenceTest() {
        assertEquals(expectedList, new Solution().minSubsequence(new int[]{4,4,7,6,7}));
    }
}