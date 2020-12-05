package com.yyc.learnleetcode.learnalgorithms.a709;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void toLowerCase() {
        Solution solution = new Solution();
        assertEquals("pitas", solution.toLowerCase("PiTAs"));
    }
}