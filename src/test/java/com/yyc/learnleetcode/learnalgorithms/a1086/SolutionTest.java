package com.yyc.learnleetcode.learnalgorithms.a1086;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    int[][] input = new int[12][];
    int[][] expected = new int[2][];

    @BeforeEach
    void initArr() {
        input[0] = new int[]{1,100};
        input[1] = new int[]{1,100};
        input[2] = new int[]{1,98};
        input[3] = new int[]{7,100};
        input[4] = new int[]{1,100};
        input[5] = new int[]{7,100};
        input[6] = new int[]{1,100};
        input[7] = new int[]{7,100};
        input[8] = new int[]{1,100};
        input[9] = new int[]{7,100};
        input[10] = new int[]{7,100};
        input[11] = new int[]{1,100};

        expected[0] = new int[]{1,100};
        expected[1] = new int[]{7,100};
    }

    @Test
    void highFive() {
        assertArrayEquals(expected, new Solution().highFive(input));
    }
}