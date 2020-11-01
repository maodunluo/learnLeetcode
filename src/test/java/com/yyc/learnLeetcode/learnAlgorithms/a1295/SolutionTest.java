package com.yyc.learnLeetcode.learnAlgorithms.a1295;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNumbers() {
        Solution solution = new Solution();
        assertEquals(1, solution.findNumbers(new int[]{555,901,482,1771}));
    }
}