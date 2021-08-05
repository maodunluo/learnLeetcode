package com.yyc.learnleetcode.learnalgorithms.a771;

/**
 * 771. Jewels and Stones
 *
 * @author yuechao
 */
public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        var result = 0;
        for (var i = 0; i < jewels.length(); i++) {
            var c = String.valueOf(jewels.charAt(i));
            for (var j = 0; j < stones.length(); j++) {
                if (c.equals(stones.substring(j, j + 1))) {
                    result++;
                }
            }
        }
        return result;
    }

    /**
     * this method is using the ASCII to count which
     * @param jewels Jewels
     * @param stones Jewels
     * @return the count of jewels
     */
    public int numJewelsInStonesWithAscii(String jewels, String stones) {
        var result = 0;
        var cnt = new int[128];
        for (char c : stones.toCharArray()) {
            cnt[c]++;
        }
        for (char c : jewels.toCharArray()) {
            result += cnt[c];
        }
        return result;
    }
}
