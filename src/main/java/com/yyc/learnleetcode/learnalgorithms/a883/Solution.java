package com.yyc.learnleetcode.learnalgorithms.a883;

/**
 * 883. Projection Area of 3D Shapes
 *
 * @author yuechao
 */
public class Solution {

  public int projectionArea(int[][] grid) {
    var result = 0;
    for (var i = 0; i < grid.length; i++) {
      var rowMax = 0;
      var columnMax = 0;
      for (var j = 0; j < grid[i].length; j++) {
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
