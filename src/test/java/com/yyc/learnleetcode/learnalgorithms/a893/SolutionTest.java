package com.yyc.learnleetcode.learnalgorithms.a893;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new String[]{"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"},
            3
        },
        new Object[]{
            new String[]{"abc", "acb", "bac", "bca", "cab", "cba"},
            3
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void numSpecialEquivGroupsTest(String[] inputArray, int expectNumber) {
    assertEquals(expectNumber, new Solution().numSpecialEquivGroups(inputArray));
  }

}