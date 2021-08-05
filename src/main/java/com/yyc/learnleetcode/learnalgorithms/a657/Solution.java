package com.yyc.learnleetcode.learnalgorithms.a657;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yuechao
 */
@Slf4j
public class Solution {
    public boolean judgeCircle(String moves) {
        var level = 0;
        var vertical = 0;
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
                    log.error("错误的方向");
            }
        }
        boolean result;
        result = (level == 0 && vertical == 0);
        return result;
    }
}
