package com.yyc.learnleetcode.learnalgorithms.a1436;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Destination City
 *
 * @author yuechao
 */
public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> hashSet = new HashSet<>();
        for (List<String> path : paths) {
            hashSet.add(path.get(1));
        }
        for (List<String> path : paths) {
            hashSet.remove(path.get(0));
        }
        return hashSet.iterator().next();
    }

    public String destcity2(List<List<String>> paths) {
        Set<String> hashSet = new HashSet<>();
        var result = "";

        for (List<String> path : paths) {
            hashSet.add(path.get(0));
        }
        for (List<String> path : paths) {
            if(!hashSet.contains(path.get(1))) {
                result = path.get(1);
                break;
            }
        }
        return result;
    }

}
