package com.yyc.learnLeetcode.learnAlgorithms.a1021;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void removeOuterParentheses() {
        Solution solution = new Solution();
        assertEquals("()()()", solution.removeOuterParentheses2("(()())(())"));
    }
}