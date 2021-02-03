package com.yyc.learnleetcode.learnalgorithms.a1725;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.sun.tools.javac.util.List;


class SolutionTest {

    static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{
                        new int[][]{{5, 8}, {3, 9}, {5, 12}, {16, 5}},
                        3
                },
                new Object[]{
                        new int[][]{{2, 3}, {3, 7}, {4, 3}, {3, 7}},
                        3
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void countGoodRectanglesTest(int[][] inputArray, int exceptedNum) {
        assertEquals(exceptedNum, new Solution().countGoodRectangles(inputArray));
    }
}