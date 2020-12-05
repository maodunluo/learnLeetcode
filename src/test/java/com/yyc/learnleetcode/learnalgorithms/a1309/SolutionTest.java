package com.yyc.learnleetcode.learnalgorithms.a1309;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void freqAlphabets() {

        assertEquals("jkab", solution.freqAlphabets("10#11#12"));
    }

    @Test
    void freqAlphabets2() {
        assertEquals("jkab", solution.freqAlphabets2("10#11#12"));
    }
}