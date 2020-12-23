package com.yyc.learnleetcode.learnalgorithms.a346;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author yuechao
 */
public class MovingAverage {
// Solution 1
//    private final Deque<Integer> queue;
//    private final int limit;
//
//    public MovingAverage(int size) {
//        queue = new ArrayDeque<>(size);
//        limit = size;
//    }
//
//    public double next(int val) {
//        double sum = 0;
//        if (limit == queue.size()) {
//            queue.pollFirst();
//        }
//        queue.offerLast(val);
//        int count = 0;
//        for (Integer integer : queue) {
//            sum += integer;
//            count++;
//        }
//        return sum / count;
//    }

//    Solution 2, 里面用了Math也是很慢
//    int size;
//    List<Integer> queue = new ArrayList<>();
//
//    public MovingAverage(int size) {
//        this.size = size;
//    }
//
//    public double next(int val) {
//        queue.add(val);
//        int windowSums = 0;
//        for (int i = Math.max(0, queue.size() - size); i < queue.size(); i++) {
//            windowSums += queue.get(i);
//        }
//        return windowSums * 1.0 / Math.min(queue.size(), size);
//    }

//Solution3 该方法是用取模的方法来计算，比上面两种方法的效率高


    private final int[] window;
    private int n;
    private int insert;
    private long sum;

    public MovingAverage(int size) {
        window = new int[size];
        insert = 0;
        sum = 0;
    }

    public double next(int val) {
        if (n < window.length) {
            n++;
        }
        sum -= window[insert];
        sum += val;
        window[insert] = val;
        insert = (insert + 1) % window.length;

        return ((double) sum) / n;
    }

}
