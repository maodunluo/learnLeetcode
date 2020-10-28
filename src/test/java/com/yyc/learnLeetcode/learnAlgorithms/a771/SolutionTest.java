package com.yyc.learnLeetcode.learnAlgorithms.a771;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("Jewels and Stones")
    void numJewelsInStones() {
        Solution solution = new Solution();
        final String J = "aA";
        final String S = "aAAbbbb";
        int excepted = 3;
        int actual = solution.numJewelsInStones(J, S);
        assertEquals(excepted, actual);
        int actual2 = solution.numJewelsInStonesWithASCII(J, S);
        assertEquals(excepted, actual2);
    }
}