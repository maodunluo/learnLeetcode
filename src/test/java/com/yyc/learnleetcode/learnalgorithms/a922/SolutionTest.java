package com.yyc.learnleetcode.learnalgorithms.a922;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void sortArrayByParityIITest() {
        assertArrayEquals(new int[]{4,5,2,7}, new Solution().sortArrayByParityII(new int[]{4,2,5,7}));
    }
}