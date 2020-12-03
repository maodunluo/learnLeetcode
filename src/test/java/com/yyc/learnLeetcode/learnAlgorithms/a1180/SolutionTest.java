package com.yyc.learnLeetcode.learnAlgorithms.a1180;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countLetters() {
        assertEquals(8, new Solution().countLetters("aaaba"));
        assertEquals(55, new Solution().countLetters("aaaaaaaaaa"));
    }
}