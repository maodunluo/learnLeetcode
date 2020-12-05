package com.yyc.learnleetcode.learnalgorithms.a771;

/**
 * 771. Jewels and Stones
 *
 * @author yuechao
 */
public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < jewels.length(); i++) {
            String c = String.valueOf(jewels.charAt(i));
            for (int j = 0; j < stones.length(); j++) {
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
    public int numJewelsInStonesWithASCII(String jewels, String stones) {
        int result = 0;
        int[] cnt = new int[128];
        for (char c : stones.toCharArray()) {
            cnt[c]++;
        }
        for (char c : jewels.toCharArray()) {
            result += cnt[c];
        }
        return result;
    }
}
