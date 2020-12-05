package com.yyc.learnleetcode.learnalgorithms.a905;

/**
 * @author yuechao
 */
public class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int[] result = new int[arr.length];
        int[] oddArray = new int[arr.length];
        int oddArrayIndex = 0;
        int resultIndex = 0;
        for (int number : arr) {
            if (number % 2 != 0) {
                oddArray[oddArrayIndex++] = number;
            } else {
                result[resultIndex++] = number;
            }
        }
        oddArrayIndex = 0;
        for (int i = resultIndex; i < arr.length; i++) {
            result[i] = oddArray[oddArrayIndex++];
        }
        return result;
    }

    public int[] simpleSortArrayByParity(int[] arr) {
        int[] result = arr;
        for (int i = 0, j = 0; j < result.length; j++) {
            if (result[j] % 2 == 0) {
                int temp = result[i];
                result[i++] = result[j];
                result[j] = temp;
            }
        }
        return result;
    }
}
