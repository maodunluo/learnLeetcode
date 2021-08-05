package com.yyc.learnleetcode.learnalgorithms.a1365;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * How Many Numbers Are Smaller Than the Current Number
 * 给到一个数组，找出其中元素比当前元素小，并且生成一个新的数组,leetcode上面的耗时和idea中的相反。
 *
 * @author yuechao
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //count数组是干什么的？-- 统计每种数字的个数。他的容量为什么是101 --因为0 <= nums[i] <= 100
        var count = new int[101];
        //创建一个结果数组
        var results = new int[nums.length];
        // 循环当前数组，每个数字个数加一
        for (int num : nums) {
            count[num]++;
        }
        //统计比当前数字小的所有数字和，只有在nums数组中的数字才会有值，其他的都是0，如果i不存在于nums数组中，count[i]和count[i-1]相同
        for (var i = 1; i <= count.length - 1; i++) {
            count[i] += count[i - 1];
        }

        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                results[i] = 0;
            } else {
                results[i] = count[nums[i] - 1];
            }
        }
        return results;
    }

    public int[] smallerNumbersThanCurrent2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(32);
        int[] copy = nums.clone();
        Arrays.sort(copy);
        for (var i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }
        for (var i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }
        return copy;
    }
}
