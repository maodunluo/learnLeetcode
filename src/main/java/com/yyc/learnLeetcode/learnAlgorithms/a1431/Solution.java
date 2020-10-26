package com.yyc.learnLeetcode.learnAlgorithms.a1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Kids With the Greatest Number of Candies
 * for && stream
 *
 * @author yuechao
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for (int value : candies) {
            if (max < value) {
                max = value;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

    /**
     * stream is slower than for loop
     *
     * @param candies      number of candies that the ith kid has
     * @param extraCandies extraCandies
     * @return the result of multiple kids can have the greatest number of candies
     */
    public List<Boolean> kidsWithCandiesWithStream(int[] candies, int extraCandies) {
        int max2 = Arrays.stream(candies).max().orElse(0);
        return Arrays.stream(candies).mapToObj(candy -> candy + extraCandies >= max2).collect(Collectors.toList());
    }
}
