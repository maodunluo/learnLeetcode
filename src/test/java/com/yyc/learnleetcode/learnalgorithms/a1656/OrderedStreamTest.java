package com.yyc.learnleetcode.learnalgorithms.a1656;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.List;

class OrderedStreamTest {

    @Test
    void insert() {
        OrderedStream os = new OrderedStream(5);
        assertEquals(new ArrayList<>(), os.insert(3, "ccccc"));
        assertEquals(List.of("aaaaa"), os.insert(1, "aaaaa"));
        assertEquals(List.of("bbbbb", "ccccc"), os.insert(2, "bbbbb"));
        assertEquals(new ArrayList<>(), os.insert(5, "eeeee"));
        assertEquals(List.of("ddddd", "eeeee"), os.insert(4, "ddddd"));
    }
}