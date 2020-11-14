package com.yyc.learnLeetcode.learnAlgorithms.a1450;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void busyStudent() {
        Solution solution = new Solution();
        assertEquals(1, solution.busyStudent(new int[]{1,2,3}, new int[]{3,2,7}, 4));
    }
}