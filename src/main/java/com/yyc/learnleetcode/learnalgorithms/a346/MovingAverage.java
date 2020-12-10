package com.yyc.learnleetcode.learnalgorithms.a346;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yuechao
 */
public class MovingAverage {

    private final Deque<Integer> queue;
    private final int limit;

    public MovingAverage(int size) {
        queue = new ArrayDeque<>(size);
        limit = size;
    }

    public double next(int val) {
        double sum = 0;
        if (limit == queue.size()) {
            queue.pollFirst();
        }
        queue.offerLast(val);
        int count = 0;
        for (Integer integer : queue) {
            sum += integer;
            count++;
        }
        return sum / count;
    }
}
