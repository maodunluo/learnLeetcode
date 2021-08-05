package com.yyc.learnleetcode.learnalgorithms.a933;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yuechao
 */
public class RecentCounter {
    List<Integer> inputList;
    private final Queue<Integer> queue;
    private static final Integer INTERVAL = 3000;

    public RecentCounter() {
        inputList = new ArrayList<>();
        queue = new LinkedList<>();
    }

    public int pingV1(int t) {
        inputList.add(t);
        int left = t - 3000;
        var leftIndex = 0;
        for (int input : inputList) {
            if (left <= input) {
                leftIndex = inputList.indexOf(input);
                break;
            }
        }
        return (inputList.size() - leftIndex);
    }

    public int pingV2(int t) {
        inputList.add(t);
        int target = t - 3000;
        Integer firstElement = inputList.get(0);
        if (inputList.size() == 1) {
            return 1;
        }
        if (target < firstElement) {
            return inputList.size();
        }
        int element = findElement(target, firstElement, t);
        while (true) {
            if ((inputList.contains(element))) {
                return inputList.size() - inputList.indexOf(element);
            } else {
                element++;
            }
        }
    }

    private int findElement(int target, int left, int right) {
        int middle = (left + right) / 2;
        if (target < middle) {
            return findElement(target, left, middle);
        } else if (target > middle) {
            return findElement(target, middle, right);
        }
        return middle;
    }

    public int ping(int t) {
        queue.add(t);
        while (t - queue.element() > INTERVAL) {
            queue.remove();
        }
        return queue.size();
    }
}
