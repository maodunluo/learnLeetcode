package com.yyc.learnleetcode.learnalgorithms.a1450;

/**
 * @author yuechao
 */
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        var result = 0;
        for (var i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                result++;
            }
        }
        return result;
    }
}
