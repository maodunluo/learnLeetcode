package com.yyc.learnleetcode.learnalgorithms.a944;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

    private static Collection<Object[]> dataProvider() {
        return List.of(
                new Object[]{
                        new String[]{"cba", "daf", "ghi"},
                        1
                },
                new Object[]{
                        new String[]{"a", "b"},
                        0
                },
                new Object[]{
                        new String[]{"zyx", "wvu", "tsr"},
                        3
                }
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    void minDeletionSizeTest(String[] inputArray, int expected) {
        assertEquals(expected, new Solution().minDeletionSize(inputArray));
    }
}