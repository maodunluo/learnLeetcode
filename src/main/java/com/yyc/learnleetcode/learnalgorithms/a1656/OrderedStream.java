package com.yyc.learnleetcode.learnalgorithms.a1656;

import java.util.LinkedList;
import java.util.List;

/**
 * @author yuechao
 */
public class OrderedStream {
    String[] res;
    int ptr = 0;

    public OrderedStream(int n) {
        res = new String[n];
    }

    public List<String> insert(int id, String value) {
        res[id - 1] = value;
        List<String> list = new LinkedList<>();
        while (ptr < res.length && res[ptr] != null) {
            list.add(res[ptr]);
            ptr++;
        }
        return list;
    }
}
