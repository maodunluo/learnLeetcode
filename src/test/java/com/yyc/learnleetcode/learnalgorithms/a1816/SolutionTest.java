package com.yyc.learnleetcode.learnalgorithms.a1816;

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
            "Hello how are you Contestant",
            4,
            "Hello how are you"
        },
        new Object[]{
            "What is the solution to this problem",
            4,
            "What is the solution"
        },
        new Object[]{
            "chopper is not a tanuki",
            5,
            "chopper is not a tanuki"
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void truncateSentenceTest(String inputString, int k, String expectString) {
    assertThat(solution.truncateSentence(inputString, k)).isEqualTo(expectString);
  }
}