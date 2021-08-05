package com.yyc.learnleetcode.learnalgorithms.a1309;

/**
 * Decrypt String from Alphabet to Integer Mapping
 * 这里第一种方法是用string，有一堆格式转换，换成charArray,用第二种方法快一点
 *
 * @author yuechao
 */
public class Solution {
    public String freqAlphabets(String s) {
        var builder = new StringBuilder();
        for (var i = 0; i < s.length(); i++) {
            if (i < s.length() - 2 && s.charAt(i + 2) == '#') {
                var substring = s.substring(i, i + 2);
                char c = (char) ((Integer.parseInt(substring) - 1) + 'a');
                builder.append(c);
                i += 2;
                continue;
            }
            builder.append((char) ((Integer.parseInt(String.valueOf(s.charAt(i))) - 1) + 'a'));
        }
        return builder.toString();
    }

    public String freqAlphabets2(String s) {
        char[] chars = s.toCharArray();
        var builder = new StringBuilder();
        for (var i = 0; i < chars.length; i++) {
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                char c = (char) (((chars[i] - '1') * 10 + chars[i + 1] - '0') + 'j');
                builder.append(c);
                i = i + 2;
                continue;
            }
            builder.append((char) ((chars[i] - '1') + 'a'));
        }
        return builder.toString();
    }
}
