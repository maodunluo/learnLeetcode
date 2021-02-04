package com.yyc.learnleetcode.learnalgorithms.a1732;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


class SolutionTest {

    static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{
                        new int[]{-5, 1, 5, 0, -7},
                        1
                },
                new Object[]{
                        new int[]{-4, -3, -2, -1, 4, 3, 2},
                        0
                },
                new Object[]{
                        new int[]{52, -91, 72},
                        52
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void instance1Test(int[] inputArray, int exceptedNum) {
        assertEquals(exceptedNum, new Solution().largestAltitude(inputArray));
    }
}
