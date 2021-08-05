package com.yyc.learnleetcode.learnalgorithms.a905;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * 905. Sort Array By Parity
 *
 * @author yuechao
 */
public class Solution {
    public int[] sortArrayByParity(int[] arr) {
        var result = new int[arr.length];
        var oddArray = new int[arr.length];
        var oddArrayIndex = 0;
        var resultIndex = 0;
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
     * 这个要保持函数没有副作用，就不能用result = arr，因为上述赋值就会将result指向arr的地址，是浅拷贝，
     * 修改result的话，arr里面的数值也会变化。要确保它们对数据结构的任何修改对于调用者都是不可见的。
     * Arrays.copyOf(arr, arr.length)也是浅拷贝。当数组里面存放的是对象时修改一处两个数组都会发生变化。
     *
     * @param arr 传入的input数组
     * @return 排序后的数组
     */
    public int[] simpleSortArrayByParity(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        for (int i = 0, j = 0; j < result.length; j++,i++) {
            if (result[j] % 2 == 0) {
                int temp = result[i];
                result[i] = result[j];
                result[j] = temp;
            }
        }
        return result;
    }

    /**
     * 新想出来的方法，但是效率最低
     *
     * @param inputArray 传入的input数组
     * @return 排序后的数组
     */
    public int[] sortArrayByParityUseDeque(int[] inputArray) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int value : inputArray) {
            if (value % 2 != 0) {
                deque.addLast(value);
            } else {
                deque.addFirst(value);
            }
        }
        var result = new int[deque.size()];
        var index = 0;
        for (Integer element : deque) {
            result[index++] = element;
        }
        return result;
    }
}
