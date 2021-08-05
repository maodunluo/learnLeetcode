package com.yyc.learnleetcode.learnalgorithms.a359;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 359. Logger Rate Limiter
 *
 * @author yuechao
 */
public class Logger {
    Map<String, Integer> map;
    private static final Integer INTERVAL = 10;

    /**
     * Initialize your data structure here.
     */
    public Logger() {
        map = new HashMap<>(32);
    }

    /**
     * Returns true if the message should be printed in the given timestamp, otherwise returns false.
     * If this method returns false, the message will not be printed.
     * The timestamp is in seconds granularity.
     */
    public boolean shouldPrintMessage(int timestamp, String message) {
        var integer = map.get(message);
        if (Objects.isNull(integer) || timestamp - integer >= INTERVAL) {
            map.put(message, timestamp);
            return true;
        }
        return false;
    }
}
