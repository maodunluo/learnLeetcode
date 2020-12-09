package com.yyc.learnleetcode.learnalgorithms.a657;

/**
 * @author yuechao
 */
public class Solution {
    public boolean judgeCircle(String moves) {
        int level = 0;
        int vertical = 0;
        for (char c:moves.toCharArray()) {
            switch (c) {
                case 'L':
                    level++;
                    break;
                case 'R':
                    level--;
                    break;
                case 'U':
                    vertical++;
                    break;
                case 'D':
                    vertical--;
                    break;
                default:
                    System.out.println("错误的方向");
            }
        }
        boolean result;
        result = (level == 0 && vertical == 0);
        return result;
    }
}
