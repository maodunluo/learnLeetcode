package com.yyc.learnLeetcode.learnAlgorithms.a1640;

/**
 * @author yuechao
 */
public class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        for (int[] anArrayPiece : pieces) {
            //防止有元素不匹配的情况
            if (anArrayPiece.length == 1) {
                int count = 0;
                for (int number : arr) {
                    if (number == anArrayPiece[0]) {
                        count++;
                    }
                }
                if (count != 1) {
                    return false;
                }
                continue;
            }
            //只要子数组的顺序和arr中的元素顺序相同就行。
            int piece = anArrayPiece[0];
            int samePieceInArrIndex = 0;
            for (int i = 0; i < arr.length; i++) {
                if (piece == arr[i]) {
                    samePieceInArrIndex = i;
                    break;
                }
            }
            for (int i = 0; i < anArrayPiece.length; i++) {
                if (arr.length <= samePieceInArrIndex + i) {
                    return false;
                }
                if (anArrayPiece[i] != arr[samePieceInArrIndex + i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
