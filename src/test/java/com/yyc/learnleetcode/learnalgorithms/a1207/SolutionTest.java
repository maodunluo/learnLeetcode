package com.yyc.learnleetcode.learnalgorithms.a1207;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void uniqueOccurrencesTest() {
        assertTrue(new Solution().uniqueOccurrences(new int[]{1, 2, 2, 1, 1, 3}));
        assertFalse(new Solution().uniqueOccurrences(new int[]{1,2}));
        assertTrue(new Solution().uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }
}