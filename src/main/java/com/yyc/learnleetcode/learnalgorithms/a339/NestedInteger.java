package com.yyc.learnleetcode.learnalgorithms.a339;


import java.util.List;

/**
 * This is the interface that allows for creating nested lists.
 * You should not implement it, or speculate about its implementation
 *
 * @author yuechao
 */
public interface NestedInteger {

    /**
     * true if this NestedInteger holds a single integer, rather than a nested list.
     *
     * @return result
     */
    boolean isInteger();

    /**
     * Return null if this NestedInteger holds a nested list
     *
     * @return the single integer that this NestedInteger holds, if it holds a single integer
     */
    Integer getInteger();

    /**
     * Set this NestedInteger to hold a single integer.
     *
     * @param value NestedInteger's value
     */
    void setInteger(int value);

    /**
     * Set this NestedInteger to hold a nested list and adds a nested integer to it.
     *
     * @param ni NestedInteger
     */
    void add(NestedInteger ni);

    /**
     * Return null if this NestedInteger holds a single integer
     *
     * @return the nested list that this NestedInteger holds, if it holds a nested list
     */
    List<NestedInteger> getList();
}

