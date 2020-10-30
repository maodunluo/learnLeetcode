package com.yyc.learnLeetcode.learnAlgorithms.a1614;

/**
 * Maximum Nesting Depth of the Parentheses
 * 前置条件已经规定了这个string是vps，所以没有考虑对其进行判断，如果要求判断是否是vps应该怎么做？
 *
 * @author yuechao
 */
public class Solution {
    public int maxDepth(String s) {
        int res = 0, cur = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '(') {
                res = Math.max(res, ++cur);
            }
            if (s.charAt(i) == ')') {
                cur--;
            }
        }
        return res;
    }

}