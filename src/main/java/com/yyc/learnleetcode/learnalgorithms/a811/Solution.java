package com.yyc.learnleetcode.learnalgorithms.a811;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 811. Subdomain Visit Count
 *
 * @author yuechao
 */
public class Solution {
    public List<String> subdomainVisits(String[] cpDomains) {
        Map<String, Integer> domainMap = new HashMap<>(32);
        for (String cpDomain : cpDomains) {
            String[] domainParameters = cpDomain.split(" ");
            Integer count = Integer.parseInt(domainParameters[0]);
            String domain = domainParameters[1];
            if (Objects.isNull(domainMap.get(domain))) {
                domainMap.put(domain, count);
            } else {
                domainMap.put(domain, count + domainMap.get(domain));
            }
            while (domain.contains(".")) {
                domain = domain.substring(domain.indexOf(".") + 1);
                if (Objects.isNull(domainMap.get(domain))) {
                    domainMap.put(domain, count);
                } else {
                    domainMap.put(domain, count + domainMap.get(domain));
                }
            }
        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : domainMap.entrySet()) {
            resultList.add(entry.getValue() + " " + entry.getKey());
        }
        return resultList;
    }
}
