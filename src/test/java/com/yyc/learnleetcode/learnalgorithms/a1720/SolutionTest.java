package com.yyc.learnleetcode.learnalgorithms.a1720;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    @DisplayName("example1")
    void decodeExample1() {
        assertArrayEquals(new int[]{1, 0, 2, 1}, new Solution().decode(new int[]{1, 2, 3}, 1));
    }

    @Test
    @DisplayName("example2")
    void decodeExample2() {
        assertArrayEquals(new int[]{4,2,0,7,4}, new Solution().decode(new int[]{6,2,7,3}, 4));
    }
}