package com.yyc.learnleetcode.learnalgorithms.a1502;

import java.util.Arrays;

/**
 * 1502. Can Make Arithmetic Progression From Sequence
 *
 * @author yuechao
 */
public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //在这里用了stream效率变得特别低
        Arrays.sort(arr);
        int gap = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != gap) {
                return false;
            }
        }
        return true;
    }
}
