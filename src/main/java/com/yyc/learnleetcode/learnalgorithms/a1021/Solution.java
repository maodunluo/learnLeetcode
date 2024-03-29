package com.yyc.learnleetcode.learnalgorithms.a1021;

/**
 * Remove Outermost Parentheses
 * 我这一种是先生成一个和String一样的，然后再在里面删除，也可以新建一个空的然后拼接，还是建一个空的然后拼接快
 * @author yuechao
 */
public class Solution {
    public String removeOuterParentheses(String input) {
        var count = 0;
        var flag = 0;
        var builder = new StringBuilder(input);
        for (int i = input.length() - 1; i >= 0; i--) {
            if (input.charAt(i) == ')') {
                count++;
            } else {
                count--;
            }
            flag++;
            if (count == 0) {
                builder.deleteCharAt(i + flag - 1);
                builder.deleteCharAt(i);
                flag = 0;
            }
        }
        return builder.toString();
    }
    
    public String removeOuterParentheses2(String s) {
        var builder = new StringBuilder();
        var open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && open++ > 0) {
                builder.append(c);
            }
            if (c == ')' && open-- > 1) {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
