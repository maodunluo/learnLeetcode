package com.yyc.learnLeetcode.learnAlgorithms.a1370;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    private static final String INPUT = "aaaabbbbcccc";
    private static final String EXPECTED = "abccbaabccba";

    @Test
    void sortStringTest() {
        assertEquals(EXPECTED, sortString(INPUT));
    }

    /**
     * 对字符串排序，格式为上升下降
     *
     * @param s 传入字符串
     * @return 排序过的字符串
     */
     private String sortString(String s) {
        //统计每个字符出现的次数
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        while (result.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    result.append((char) (i + 'a'));
                    count[i]--;
                }
            }
            for (int j = 25; j >= 0; j--) {
                if (count[j] > 0) {
                    result.append((char) (j + 'a'));
                    count[j]--;
                }
            }
        }
        return result.toString();
    }

    @Test
    void simpleSortStringTest() {
        assertEquals(EXPECTED, simpleSortString(INPUT));
    }

    /**
     * 对字符串排序，格式为上升下降,将与sortString方法相比是将重复代码抽取出来
     *
     * @param s 传入字符串
     * @return 排序过的字符串
     */
    private String simpleSortString(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        StringBuilder result = new StringBuilder();
        while (result.length() < s.length()) {
            appendString(result, count, true);
            appendString(result, count, false);
        }
        return result.toString();
    }

    /**
     * 用于将字符进行排序，并存放在stringBuilder中
     *
     * @param stringBuilder 用于存放排序的字符
     * @param count 字符数组-里面存放每个字符的数量
     * @param asc 是否是升序
     */
    private void appendString(StringBuilder stringBuilder, int[] count, boolean asc) {
        for (int i = 0; i < 26; i++) {
            int j = asc ? i : 25 - i;
            if (count[j]-- > 0) {
                stringBuilder.append((char) (j + 'a'));
            }
        }
    }

    @Test
    void sortStringUseTreeMapTest() {
        assertEquals(EXPECTED, sortStringWithTreeMap(INPUT));
    }

    private String sortStringWithTreeMap(String s) {
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (char c : s.toCharArray()) {
            treeMap.put(c, treeMap.getOrDefault(c, 0) + 1);
        }
        boolean asc = true;
        StringBuilder result = new StringBuilder();
        while (!treeMap.isEmpty()) {
            for (char c : (asc ? new TreeSet<>(treeMap.keySet()) : new TreeSet<>(treeMap.descendingKeySet()))) {
                result.append(c);
                treeMap.put(c, treeMap.get(c) - 1);
                treeMap.remove(c, 0);
            }
            asc = !asc;
        }
        return result.toString();
    }



}