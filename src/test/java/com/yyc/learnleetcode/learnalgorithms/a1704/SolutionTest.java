package com.yyc.learnleetcode.learnalgorithms.a1704;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.List;

class SolutionTest {

    @Test
    void halvesAreAlikeTest() {
        assertTrue(new Solution().halvesAreAlike("book"));
        assertFalse(new Solution().halvesAreAlike("textbook"));
        assertFalse(new Solution().halvesAreAlike("MerryChristmas"));
        assertTrue(new Solution().halvesAreAlike("AbCdEfGh"));
    }
}