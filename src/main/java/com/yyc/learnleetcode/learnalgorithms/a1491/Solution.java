package com.yyc.learnleetcode.learnalgorithms.a1491;

/**
 * 1491. Average Salary Excluding the Minimum and Maximum Salary
 *
 * @author yuechao
 */
public class Solution {

  public double average(int[] salary) {
    int minElement = salary[0];
    int maxElement = salary[0];
    double sum = 0;
    for (int value : salary) {
      if (maxElement < value) {
        maxElement = value;
      }
      if (minElement > value) {
        minElement = value;
      }
      sum += value;
    }
    return (sum - minElement - maxElement) / (salary.length - 2);
  }
}
