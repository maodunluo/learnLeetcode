package com.yyc.learnleetcode.learnalgorithms.a42;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1},
            6
        },
        new Object[]{
            new int[]{4, 2, 0, 3, 2, 5},
            9
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void trapTest(int[] input, int expect) {
    assertEquals(expect, new Solution().trap(input));
  }

}