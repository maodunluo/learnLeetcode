package com.yyc.learnLeetcode.learnAlgorithms.a1528;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void restoreString() {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String excepted = "leetcode";
        Solution solution = new Solution();
        assertEquals(excepted,solution.restoreString(s, indices));
    }
}