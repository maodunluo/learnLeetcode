package com.yyc.learnLeetcode.learnAlgorithms.a728;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yuechao
 */
public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> numberLists = new LinkedList<>();
        for (int i = left; i <= right; i++) {
            if (verifySelfDividingNumber(i)) {
                numberLists.add(i);
            }
        }
        return numberLists;
    }

    public boolean verifySelfDividingNumber(int number) {
        if (number < 10) {
            return true;
        }
        int flag = number;
        do {
            int remainder = flag % 10;
            if (remainder == 0 || number % remainder != 0) {
                return false;
            }
            flag = flag / 10;
        } while (flag != 0);
        return true;
    }
}
