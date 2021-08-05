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
    public int[] decompressRleList(int[] nums) {
        var arraySize = 0;
        for (var i = 0; i < nums.length; i += GAP) {
            arraySize += nums[i];
        }
        var result = new int[arraySize];
        var pos = 0;
        for (var i = 0; i < nums.length; i += GAP) {
            var ints = new int[nums[i]];
            for (int j: ints){
                j = nums[i+1];
                result[pos] = j;
                pos++;
            }
//            也可以用Arrays.fill(result, pos, pos + nums[i], nums[i + 1]);
//            pos += nums[i];
        }
        return result;
    }

    public int[] decompressRleList2(int[] nums) {
        var arraySize = 0;
        for (var i = 0; i < nums.length; i += GAP) {
            arraySize += nums[i];
        }
        //leetcode不支持引用nio中的IntBuffer,但是可以用Arrays
        var intBuffer = IntBuffer.allocate(arraySize);

        for (var i = 0; i < nums.length; i += GAP) {
            var ints = new int[nums[i]];
            Arrays.fill(ints, nums[i+1]);
            intBuffer.put(ints);
        }
        return intBuffer.array();
    }
}
