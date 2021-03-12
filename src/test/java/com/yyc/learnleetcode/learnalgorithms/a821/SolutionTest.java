package com.yyc.learnleetcode.learnalgorithms.a821;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            "loveleetcode",
            'e',
            new int[]{3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}
        },
        new Object[]{
            "aaab",
            'b',
            new int[]{3, 2, 1, 0}
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void shortestToChar(String input, char c, int[] expectedArray) {
    assertArrayEquals(expectedArray, new Solution().shortestToChar(input, c));
  }
}