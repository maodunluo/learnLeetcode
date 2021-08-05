package com.yyc.learnleetcode.learnalgorithms.a1570;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class AppTest {

  private static Collection<Object[]> dataProvider() {
    return List.of(
        new Object[]{
            new int[]{1, 0, 0, 2, 3},
            new int[]{0, 3, 0, 4, 0},
            8
        },
        new Object[]{
            new int[]{0, 1, 0, 0, 0},
            new int[]{0, 0, 0, 0, 2},
            0
        },
        new Object[]{
            new int[]{0, 1, 0, 0, 2, 0, 0},
            new int[]{1, 0, 0, 0, 3, 0, 4},
            6
        }
    );
  }

  @Test
  void shouldExecuteWithoutExceptions() {
    assertDoesNotThrow(() -> App.main(new String[]{}));
  }

  @ParameterizedTest
  @MethodSource("dataProvider")
  void sparseVectorTest(int[] vector1, int[] vector2, int exceptedValue) {
    assertEquals(exceptedValue, App.executeDotProduct(vector1, vector2));
  }

}