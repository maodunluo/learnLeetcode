package com.yyc.learnleetcode.learnalgorithms.a811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 811. Subdomain Visit Count
 *
 * @author yuechao
 */
public class Solution {

    private static final String DOT = ".";
    private static final String POINT = " ";

    public List<String> subdomainVisits(String[] cpDomains) {
        Map<String, Integer> domainMap = new HashMap<>(32);

        for (String cpDomain : cpDomains) {
            String[] domainParameters = cpDomain.split(POINT);
            Integer count = Integer.parseInt(domainParameters[0]);
            String domain = domainParameters[1];
            domainMap.put(domain, count + domainMap.getOrDefault(domain, 0));
            while (domain.contains(DOT)) {
                domain = domain.substring(domain.indexOf(DOT) + 1);
                domainMap.put(domain, count + domainMap.getOrDefault(domain, 0));
            }
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : domainMap.entrySet()) {
            resultList.add(entry.getValue() + POINT + entry.getKey());
        }
        return resultList;
    }
}
