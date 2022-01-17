package com.yyc.learnleetcode.learnalgorithms.a496;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{4, 1, 2},
            new int[]{1, 3, 4, 2},
            new int[]{-1, 3, -1}
        },
        new Object[]{
            new int[]{2, 4},
            new int[]{1, 2, 3, 4},
            new int[]{3, -1},
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void nextGreaterElementTest(int[] input1, int[] input2, int[] expected) {
    assertArrayEquals(expected, new Solution().nextGreaterElement(input1, input2));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void nextGreaterElement2Test(int[] input1, int[] input2, int[] expected) {
    assertArrayEquals(expected, new Solution().nextGreaterElement2(input1, input2));
  }

}