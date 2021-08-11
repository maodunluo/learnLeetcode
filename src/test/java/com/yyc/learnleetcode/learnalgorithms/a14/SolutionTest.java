package com.yyc.learnleetcode.learnalgorithms.a14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new String[]{"flower", "flow", "flight"},
            "fl"
        },
        new Object[]{
            new String[]{"dog", "racecar", "car"},
            ""
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void longestCommonPrefixTest(String[] inputArray, String expectedResult) {
    assertEquals(expectedResult, solution.longestCommonPrefix(inputArray));
  }

}