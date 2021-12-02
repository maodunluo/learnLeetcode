package com.yyc.learnleetcode.learnalgorithms.a2011;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private final Solution solution = new Solution();

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new String[]{"--X","X++","X++"},
            1
        },
        new Object[]{
            new String[]{"++X","++X","X++"},
            3
        },
        new Object[]{
            new String[]{"X++","++X","--X","X--"},
            0
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void buildArrayTest(String[] inputArray, int excepted) {
    assertThat(solution.finalValueAfterOperations(inputArray)).isEqualTo(excepted);
  }
}