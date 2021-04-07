package com.yyc.learnleetcode.learnalgorithms.a1812;

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
            "a1",
            false
        },
        new Object[]{
            "h3",
            true
        },
        new Object[]{
            "c7",
            false
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void squareIsWhiteTest(String input, boolean expect) {
    assertThat(solution.squareIsWhite(input)).isEqualTo(expect);
  }


}