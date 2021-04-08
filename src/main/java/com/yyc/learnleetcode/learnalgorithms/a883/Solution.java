package com.yyc.learnleetcode.learnalgorithms.a883;

/**
 * 883. Projection Area of 3D Shapes
 *
 * @author yuechao
 */
public class Solution {

  public int projectionArea(int[][] grid) {
    int result = 0;
    for (int i = 0; i < grid.length; i++) {
      int rowMax = 0;
      int columnMax = 0;
      for (int j = 0; j < grid[i].length; j++) {
        if (grid[i][j] > rowMax) {
          rowMax = grid[i][j];
        }
        if (grid[j][i] > columnMax) {
          columnMax = grid[j][i];
        }
        if (grid[i][j] != 0) {
          result++;
        }
      }
      result += rowMax;
      result += columnMax;
    }
    return result;
  }
}
