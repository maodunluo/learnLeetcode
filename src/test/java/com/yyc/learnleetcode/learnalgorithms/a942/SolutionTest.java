package com.yyc.learnleetcode.learnalgorithms.a942;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diStringMatch() {
        assertArrayEquals(new int[]{0,4,1,3,2}, new Solution().diStringMatch("IDID"));
    }
}