package com.yyc.learnleetcode.learnalgorithms.a852;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{
                        new int[]{0, 1, 0},
                        1
                },
                new Object[]{
                        new int[]{0, 2, 1, 0},
                        1
                },
                new Object[]{
                        new int[]{0, 10, 5, 2},
                        1
                },
                new Object[]{
                        new int[]{3, 4, 5, 1},
                        2
                },
                new Object[]{
                        new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19},
                        2
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void peakIndexInMountainArrayTest(int[] inputArray, int expected) {
        assertEquals(expected, new Solution().peakIndexInMountainArray(inputArray));
    }
}