package com.yyc.learnleetcode.learnalgorithms.a1380;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{
                        new int[][]{{3, 7, 8}, {9, 11, 13}, {15, 16, 17}},
                        List.of(15)
                },
                new Object[]{
                        new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}},
                        List.of(12)
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void luckyNumbersTest(int[][] inputArray, List<Integer> expectedList) {
        assertEquals(expectedList, new Solution().luckyNumbers(inputArray));
    }
}