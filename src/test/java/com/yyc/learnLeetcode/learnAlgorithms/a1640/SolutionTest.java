package com.yyc.learnLeetcode.learnAlgorithms.a1640;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    int[] arr1 = new int[]{85};
    int[][] pieces1 = new int[][]{{85}};

    int[] arr2 = new int[]{15, 88};
    int[][] pieces2 = new int[][]{{88}, {15}};

    int[] arr3 = new int[]{49, 18, 16};
    int[][] pieces3 = new int[][]{{16, 18, 49}};

    int[] arr4 = new int[]{91, 4, 64, 78};
    int[][] pieces4 = new int[][]{{78}, {4, 64}, {91}};

    //找出pieces二维数组中的一维数组是否有多个元素的，然后看这一维数组的元素顺序是否和arr中的相同。
    //检查有一个元素的是否和arr的相对应。

    @Test
    void canFormArray() {
        assertTrue(complexFormArray(arr1, pieces1));
        assertTrue(complexFormArray(arr2, pieces2));
        assertFalse(complexFormArray(arr3, pieces3));
        assertTrue(complexFormArray(arr4, pieces4));
    }

    boolean complexFormArray(int[] arr1, int[][] pieces1) {
        for (int[] pieces : pieces1) {
            //把一个的都通过
            if (pieces.length == 1) {
                //处理一个的情况.找出数组里是否有这一个元素。必须得遍历一遍。有改进的空间吗？
                int count = 0;
                for (int number : arr1) {
                    if (number == pieces[0]) {
                        count++;
                    }
                }
                if (count != 1) {
                    return false;
                }
                continue;
            }
            //只要子数组的顺序和arr中的元素顺序相同就行。
            int piece = pieces[0];
            int samePieceInArrIndex = 0;
            for (int i = 0; i < arr1.length; i++) {
                if (piece == arr1[i]) {
                    samePieceInArrIndex = i;
                    break;
                }
            }
            for (int i = 0; i < pieces.length; i++) {
                if (arr1.length <= samePieceInArrIndex + i) {
                    return false;
                }
                if (pieces[i] != arr1[samePieceInArrIndex + i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Test
    void canFormArrayForStringBuilder() {
        assertTrue(useStringBuilder(arr1, pieces1));
        assertTrue(useStringBuilder(arr2, pieces2));
        assertFalse(useStringBuilder(arr3, pieces3));
        assertTrue(useStringBuilder(arr4, pieces4));
    }

    boolean useStringBuilder(int[] arr, int[][] pieces) {
        StringBuilder arrStringBuilder = new StringBuilder();
        for (int arrElement : arr) {
            arrStringBuilder.append(arrElement);
            arrStringBuilder.append("#");
        }

        for (int[] piece : pieces) {
            StringBuilder piecesStringBuilder = new StringBuilder();
            for (int number : piece) {
                piecesStringBuilder.append(number);
                piecesStringBuilder.append("#");
            }
            if (!arrStringBuilder.toString().contains(piecesStringBuilder.toString())) {
                return false;
            }
        }
        return true;
    }
}