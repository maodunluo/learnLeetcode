package com.yyc.learnleetcode.learnalgorithms.a1337;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{
                        new int[][]{{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}},
                        3,
                        new int[]{2, 0, 3}
                },
                new Object[]{
                        new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}},
                        2,
                        new int[]{0, 2}
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void kWeakestRowsTest(int[][] inputArray, int k, int[] expectedArray) {
        assertArrayEquals(expectedArray, new Solution().kWeakestRows(inputArray, k));
    }
}