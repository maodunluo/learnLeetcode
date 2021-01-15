package com.yyc.learnleetcode.learnalgorithms.a1678;

/**
 * 1678. Goal Parser Interpretation
 *
 * @author yuechao
 */
public class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}
