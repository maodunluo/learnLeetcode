package com.yyc.learnleetcode.learnalgorithms.a503;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{1, 2, 1},
            new int[]{2, -1, 2}
        },
        new Object[]{
            new int[]{1, 5, 3, 6, 8},
            new int[]{5, 6, 6, 8, -1}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void nextGreaterElementsTest(int[] input, int[] expected) {
    assertArrayEquals(expected, new Solution().nextGreaterElements(input));
  }

}