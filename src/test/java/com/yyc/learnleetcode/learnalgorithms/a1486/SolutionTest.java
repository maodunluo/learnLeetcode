package com.yyc.learnleetcode.learnalgorithms.a1486;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void xorOperation() {
        Solution solution = new Solution();
        int except = 8;
        int actual = solution.xorOperation(5, 0);
        assertEquals(except, actual);
    }
}