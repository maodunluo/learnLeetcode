package com.yyc.learnLeetcode.learnAlgorithms.a1108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void defangIPaddr() {
        Solution solution = new Solution();
        assertEquals("1[.]1[.]1[.]1", solution.defangIPaddr("1.1.1.1"));
    }
}