package com.yyc.learnleetcode.learnalgorithms.a1436;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    List<List<String>> paths = new ArrayList<>();

    @BeforeEach
    public void initPaths() {
        List<String> p = new ArrayList<>();
        p.add("London");
        p.add("New York");
        paths.add(p);
        p.clear();
        p.add("New York");
        p.add("Lima");
        paths.add(p);

    }


    @Test
    void destCity() {

        Set<String> hashSet = new HashSet<>();

        for (List<String> path : paths) {
            hashSet.add(path.get(1));
        }
        for (List<String> path : paths) {
            hashSet.remove(path.get(0));
        }
        System.out.println(hashSet.size());
        System.out.println(hashSet.iterator().next());
        assertEquals(1, hashSet.size());
    }

    @Test
    void testSet() {
        Solution solution = new Solution();
        String destination = solution.destcity2(paths);
        assertEquals("Lima", destination);
    }
}