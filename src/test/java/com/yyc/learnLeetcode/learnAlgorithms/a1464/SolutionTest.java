package com.yyc.learnLeetcode.learnAlgorithms.a1464;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxProduct() {
        Solution solution = new Solution();
        assertEquals(12, solution.maxProduct(new int[]{3,4,5,2}));
    }
}