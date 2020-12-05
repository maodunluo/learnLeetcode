package com.yyc.learnleetcode.learnalgorithms.a1213;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yuechao
 */
public class Solution {
    public List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new LinkedList<>();
        for (int element : arr1) {
            for (int item : arr2) {
                if (element == item) {
                    for (int value : arr3) {
                        if (item == value) {
                            result.add(element);
                            break;
                        }
                    }
                    break;
                }
            }
        }
        return result;
    }

    public List<Integer> simpleArraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> result = new LinkedList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++;
                j++;
                k++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        return result;
    }
}
