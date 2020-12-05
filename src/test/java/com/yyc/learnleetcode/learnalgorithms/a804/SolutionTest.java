package com.yyc.learnleetcode.learnalgorithms.a804;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uniqueMorseRepresentations() {
        Solution solution = new Solution();
        assertEquals(2, solution.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }
}