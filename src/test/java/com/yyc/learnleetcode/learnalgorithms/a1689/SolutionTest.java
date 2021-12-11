package com.yyc.learnleetcode.learnalgorithms.a1689;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            "32",
            3
        },
        new Object[]{
            "82734",
            8
        },
        new Object[]{
            "27346209830709182346",
            9
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void minPartitionsTest(String input, int expected) {
    assertThat(solution.minPartitions(input)).isEqualTo(expected);
  }

}