package com.yyc.learnleetcode.learnalgorithms.a1342;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void numberOfStepsTest() {
        Solution solution = new Solution();
        int initNumber = 14;
        int excepted = 6;
        int actual = solution.numberOfSteps(initNumber);
        assertEquals(excepted, actual);
    }

}