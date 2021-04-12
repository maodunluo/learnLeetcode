package com.yyc.learnleetcode.learnalgorithms.a1332;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            "ababa",
            1
        },
        new Object[]{
            "abb",
            2
        },
        new Object[]{
            "baabb",
            2
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void removePalindromeSubTest(String input, int expect) {
    assertThat(solution.removePalindromeSub(input)).isEqualTo(expect);
  }


}