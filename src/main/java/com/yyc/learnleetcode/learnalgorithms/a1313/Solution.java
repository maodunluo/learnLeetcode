package com.yyc.learnleetcode.learnalgorithms.a1313;

import java.nio.IntBuffer;
import java.util.Arrays;

/**
 * Decompress Run-Length Encoded List
 *
 * @author yuechao
 */
public class Solution {
    private static final int GAP = 2;
    public int[] decompressRLEList(int[] nums) {
        int arraySize = 0;
        for (int i = 0; i < nums.length; i += GAP) {
            arraySize += nums[i];
        }
        int[] result = new int[arraySize];
        int pos = 0;
        for (int i = 0; i < nums.length; i += GAP) {
            int[] ints = new int[nums[i]];
            for (int j: ints){
                j = nums[i+1];
                result[pos] = j;
                pos++;
            }
            //也可以用下面这个来进行数组元素赋值，和上面的原理是一样的
//            Arrays.fill(result, pos, pos + nums[i], nums[i + 1]);
//            pos += nums[i];
        }
        return result;
    }

    public int[] decompressRLEList2(int[] nums) {
        int arraySize = 0;
        for (int i = 0; i < nums.length; i += GAP) {
            arraySize += nums[i];
        }
        //leetcode不支持引用nio中的IntBuffer,但是可以用Arrays
        IntBuffer intBuffer = IntBuffer.allocate(arraySize);

        for (int i = 0; i < nums.length; i += GAP) {
            int[] ints = new int[nums[i]];
            Arrays.fill(ints, nums[i+1]);
            intBuffer.put(ints);
        }
        return intBuffer.array();
    }
}
