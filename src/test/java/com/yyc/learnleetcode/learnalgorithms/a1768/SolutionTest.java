package com.yyc.learnleetcode.learnalgorithms.a1768;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void mergeAlternatelyTest() {
        assertEquals("apbqcr", new Solution().mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", new Solution().mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", new Solution().mergeAlternately("abcd", "pq"));
    }
}