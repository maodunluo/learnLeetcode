package com.yyc.learnleetcode.learnalgorithms.a1119;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void removeVowelsTest() {
        String input = "leetcodeisacommunityforcoders";
        String expected = "ltcdscmmntyfrcdrs";
        assertEquals(expected, new Solution().removeVowels(input));
    }

    private String removeVowels(String S) {
        StringBuilder result = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                result.append(c);
            }
        }
        return result.toString();
    }
}