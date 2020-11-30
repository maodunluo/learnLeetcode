package com.yyc.learnLeetcode.learnAlgorithms.a1165;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void calculateTimeTest() {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "cba";
        assertEquals(4, calculateTime(keyboard, word));
    }

    @Test
    void calculateTimeTest2() {
        String keyboard2 = "pqrstuvwxyzabcdefghijklmno";
        String word2 = "leetcode";
        assertEquals(73, calculateTime(keyboard2, word2));
    }


    /**
     * 该方法只适用于example1，2 实际运行的时候keyboard打乱顺序就有问题了
     *
     * @param keyboard 二十六个小写英文字母组成的字符串（必须有顺序）
     * @param word     给定的字符串
     * @return 特定的移动顺序
     */
    public int calculateTimeDisuse(String keyboard, String word) {
        int result = 0;
        char wordFirstChar = word.charAt(0);
        char keyboardFirstChar = keyboard.charAt(0);
        result += getFirstMoveInterval(wordFirstChar, keyboardFirstChar);
        result += getIntervalSumExceptFirst(word, keyboardFirstChar);

        return result;
    }

    private int getIntervalSumExceptFirst(String word, char keyboardFirstChar) {
        char keyboardLastChar;
        keyboardLastChar = getKeyboardLastChar(keyboardFirstChar);
        int intervalSum = 0;
        for (int i = 1; i <= word.length() - 1; i++) {
            if (word.charAt(i) > keyboardLastChar) {
                intervalSum += (26 - word.charAt(i) + word.charAt(i - 1));
            } else if (word.charAt(i - 1) > keyboardLastChar) {
                intervalSum += (26 - word.charAt(i - 1) + word.charAt(i));
            } else {
                intervalSum += Math.abs(word.charAt(i) - word.charAt(i - 1));
            }
        }
        return intervalSum;
    }

    private char getKeyboardLastChar(char keyboardFirstChar) {
        char keyboardLastChar;
        if (keyboardFirstChar == 'a') {
            keyboardLastChar = 'z';
        } else {
            keyboardLastChar = (char) (keyboardFirstChar - 1);
        }
        return keyboardLastChar;
    }

    private int getFirstMoveInterval(char wordFirstChar, char keyboardFirstChar) {
        int firstMoveInterval;
        if (wordFirstChar >= keyboardFirstChar) {
            firstMoveInterval = wordFirstChar - keyboardFirstChar;
        } else {
            firstMoveInterval = (26 + wordFirstChar - keyboardFirstChar);
        }
        return firstMoveInterval;
    }


    public int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < keyboard.length(); i++) {
            hashMap.put(keyboard.charAt(i), i);
        }
        int result = 0;
        result += hashMap.get(word.charAt(0));
        for (int i = 1; i <= word.length() - 1; i++) {
            result += Math.abs(hashMap.get(word.charAt(i)) - hashMap.get(word.charAt(i - 1)));
        }
        return result;
    }

    @Test
    void calculateTimeUseArrayTest() {
        String keyboard2 = "pqrstuvwxyzabcdefghijklmno";
        String word2 = "leetcode";
        assertEquals(73, calculateTimeUseArray(keyboard2, word2));
    }

    public int calculateTimeUseArray(String keyboard, String word) {
        int[] keyboardArray = new int[26];
        for (int i = 0; i < keyboardArray.length; i++) {
            keyboardArray[keyboard.charAt(i) - 'a'] = i;
        }
        int result = 0;
        int last = 0;
        for (char c : word.toCharArray()) {
            result += Math.abs(keyboardArray[c - 'a'] - last);
            last = keyboardArray[c - 'a'];
        }
        return result;
    }
}