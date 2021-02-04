package com.yyc.learnleetcode.learnalgorithms.a1051;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
    static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{
                        new int[]{1, 1, 4, 2, 1, 3},
                        3
                },
                new Object[]{
                        new int[]{5, 1, 2, 3, 4},
                        5
                },
                new Object[]{
                        new int[]{1, 2, 3, 4, 5},
                        0
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void heightCheckerTest(int[] inputArrays, int expected) {
        assertEquals(expected, new Solution().heightChecker(inputArrays));
    }
}