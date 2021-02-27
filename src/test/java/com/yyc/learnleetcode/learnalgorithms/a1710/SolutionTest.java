package com.yyc.learnleetcode.learnalgorithms.a1710;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[][]{{1, 3}, {2, 2}, {3, 1}},
            4,
            8
        },
        new Object[]{
            new int[][]{{5, 10}, {2, 5}, {4, 7}, {3, 9}},
            10,
            91
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void maximumUnits(int[][] inputArray, int trunkSize, int expectNumber) {
    assertEquals(expectNumber, new Solution().maximumUnits(inputArray, trunkSize));
  }
}