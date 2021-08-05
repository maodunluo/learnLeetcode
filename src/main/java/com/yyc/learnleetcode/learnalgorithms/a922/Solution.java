package com.yyc.learnleetcode.learnalgorithms.a922;

/**
 * 922. Sort Array By Parity II
 *
 * @author yuechao
 */
public class Solution {
    public int[] sortArrayByParityII(int[] inputArray)
    {
        var oddIndex = 0;
        var evenIndex = 1;
        var resultArray = new int[inputArray.length];
        for (int element : inputArray)
        {
            if (element % 2 != 0){
                resultArray[evenIndex] = element;
                evenIndex+=2;
            } else {
                resultArray[oddIndex] = element;
                oddIndex+=2;
            }
        }
        return resultArray;
    }
}
