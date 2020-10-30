package com.yyc.learnLeetcode.learnAlgorithms.a1221;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void balancedStringSplit() {
        Solution solution = new Solution();
        assertEquals(2, solution.balancedStringSplit("RLRRRLLRLL"));
    }
}