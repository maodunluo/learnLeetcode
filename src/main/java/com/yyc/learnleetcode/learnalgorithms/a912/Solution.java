package com.yyc.learnleetcode.learnalgorithms.a912;

import java.util.Arrays;

/**
 * @author yuechao
 */
public class Solution {
    public int[] sortArray(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int len = arr.length;
        int gap = len / 2;
        int current;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                current = arr[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && current < arr[preIndex]) {
                    arr[preIndex + gap] = arr[preIndex];
                    preIndex -= gap;
                }
                arr[preIndex + gap] = current;
            }
            gap /= 2;
        }
        return arr;
    }

    public int[] insertionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int current;
        for (int i = 0; i < arr.length - 1; i++) {
            int preIndex = i;
            current = arr[i + 1];
            while (preIndex >= 0 && current < arr[preIndex]) {
                arr[preIndex + 1] = arr[preIndex];
                preIndex--;
            }
            arr[preIndex + 1] = current;
        }
        return arr;
    }

    public int[] bobbleSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int temp;
        boolean flag = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return arr;
    }

    public int[] selectionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public int[] unionSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int middle = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);
        return mergeSort(unionSort(left), unionSort(right));
    }

    private int[] mergeSort(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int index = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] > right[j]) {
                result[index] = right[j++];
            } else {
                result[index] = left[i++];
            }
        }
        return result;
    }

}
