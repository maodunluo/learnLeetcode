package com.yyc.learnleetcode.learnalgorithms.a905;

import java.util.Arrays;

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

    /**
     *
     * 这个要保持函数没有副作用，就不能用result = arr，因为上述赋值就会将result指向arr的地址，是浅拷贝，
     * 修改result的话，arr里面的数值也会变化。可以用以下语句进行深拷贝。要确保它们对数据结构的任何修改对于调用者都是不可见的。
     *
     * @param arr 传入的input数组
     * @return 排序后的数组
     */
    public int[] simpleSortArrayByParity(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
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
