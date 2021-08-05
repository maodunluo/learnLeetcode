package com.yyc.learnleetcode.learnalgorithms.a1217;

/**
 * 1217. Minimum Cost to Move Chips to The Same Position
 *
 * @author yuechao
 */
public class Solution {
    public int minCostToMoveChips(int[] position) {
        var positionArray = new int[2];
        for (int number : position) {
            if (number % 2 == 1) {
                positionArray[1] += 1;
            } else {
                positionArray[0] += 1;
            }
        }
        return Math.min(positionArray[0], positionArray[1]);
    }
}
