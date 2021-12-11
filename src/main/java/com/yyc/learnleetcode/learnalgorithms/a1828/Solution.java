package com.yyc.learnleetcode.learnalgorithms.a1828;

/**
 * 1828. Queries on Number of Points Inside a Circle
 *
 * @author admin
 */
public class Solution {

  public int[] countPoints(int[][] points, int[][] queries) {
    int[] result = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      int[] query = queries[i];
      for (int[] point : points) {
        if (Math.sqrt(
            Math.pow((double) query[0] - point[0], 2) + Math.pow((double) query[1] - point[1], 2))
            <= query[2]) {
          result[i]++;
        }
      }
    }
    return result;
  }

}
