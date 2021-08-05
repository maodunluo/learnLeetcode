package com.yyc.learnleetcode.learnalgorithms.a339;

import java.util.List;

/**
 * @author yuechao
 */
public class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        var depth = 1;
        return depthSum(nestedList, depth);
    }

    /**
     * 要注意这三种区别，自增运算符会影响外层的depth。java参数的值传递问题，参数值传入方法以后，再对参数的操作已经和方法内的值没关系了。
     * result += depthSum(innerNestedList, depth++);
     * result += depthSum(innerNestedList, ++depth);
     *
     * @param nestedList 传进来的list
     * @param depth 深度
     * @return 深度的和
     */
    private int depthSum(List<NestedInteger> nestedList, int depth) {
        var result = 0;
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                result += (nestedInteger.getInteger() * depth);
            } else {
                List<NestedInteger> innerNestedList = nestedInteger.getList();
                result += depthSum(innerNestedList, depth + 1);
            }
        }
        return result;
    }
}
