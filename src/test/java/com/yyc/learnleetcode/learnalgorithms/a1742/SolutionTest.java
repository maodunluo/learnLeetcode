package com.yyc.learnleetcode.learnalgorithms.a1742;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.sun.tools.javac.util.List;

class SolutionTest {
    static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{
                        new int[]{1, 10},
                        2
                },
                new Object[]{
                        new int[]{5, 15},
                        2
                },
                new Object[]{
                        new int[]{19, 28},
                        2
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void countBalls(int[] inputArray, int exceptedNum) {
        assertEquals(exceptedNum, new Solution().countBalls(inputArray[0], inputArray[1]));
    }
}