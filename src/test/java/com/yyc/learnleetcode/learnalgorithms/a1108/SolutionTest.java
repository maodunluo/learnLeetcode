package com.yyc.learnleetcode.learnalgorithms.a1108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void defangIPaddr() {
        Solution solution = new Solution();
        assertEquals("1[.]1[.]1[.]1", solution.defangIpAddr("1.1.1.1"));
    }
}