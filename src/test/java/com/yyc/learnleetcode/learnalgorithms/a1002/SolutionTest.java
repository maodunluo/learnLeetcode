package com.yyc.learnleetcode.learnalgorithms.a1002;

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
            new String[]{"bella", "label", "roller"},
            List.of("l", "l", "e")
        },
        new Object[]{
            new String[]{"cool", "lock", "cook"},
            List.of("c", "o")
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void commonChars(String[] inputStringArray, List<String> expectList) {
    assertEquals(expectList, solution.commonChars(inputStringArray));
  }
}