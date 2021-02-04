package com.yyc.learnleetcode.learnalgorithms.a1704;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void halvesAreAlikeTest() {
        assertTrue(new Solution().halvesAreAlike("book"));
        assertFalse(new Solution().halvesAreAlike("textbook"));
        assertFalse(new Solution().halvesAreAlike("MerryChristmas"));
        assertTrue(new Solution().halvesAreAlike("AbCdEfGh"));
    }
}