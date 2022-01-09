package com.yyc.learnleetcode.learnalgorithms.a1769;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            "110",
            new int[]{1, 1, 3}
        },
        new Object[]{
            "001011",
            new int[]{11, 8, 5, 4, 3, 4}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void minOperationsTest(String boxes, int[] expected){
    assertArrayEquals(expected, new Solution().minOperations(boxes));
  }

}