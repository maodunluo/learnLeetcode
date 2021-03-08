package com.yyc.learnleetcode.learnalgorithms.a1773;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {

  private static Collection<Object[]> dataProvider () {
    return List.of(
        new Object[] {
            List.of(
                List.of("phone","blue","pixel"),
                List.of("computer","silver","lenovo"),
                List.of("phone","gold","iphone")
            ),
            "color",
            "silver",
            1
        },
        new Object[] {
            List.of(
                List.of("phone","blue","pixel"),
                List.of("computer","silver","phone"),
                List.of("phone","gold","iphone")
            ),
            "type",
            "phone",
            2
        }
    );
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void countMatchesTest(List<List<String>> items, String ruleKey, String ruleValue, int expectNumber) {
    assertEquals(expectNumber, new Solution().countMatches(items, ruleKey, ruleValue));
  }
}