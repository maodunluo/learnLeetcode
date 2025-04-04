package com.yyc.learnleetcode.learnalgorithms.a590;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author yuechao
 */
public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        if (!CollectionUtils.isEmpty(root.children)) {
            for (Node child : root.children) {
                result.addAll(postorder(child));
            }
        }
        result.add(root.val);
        return result;
    }

    public List<Integer> postOrderUseStack(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            result.add(root.val);
            if (!CollectionUtils.isEmpty(root.children)) {
                for (Node node : root.children) {
                    stack.push(node);
                }
            }
        }
        Collections.reverse(result);
        return result;
    }

    public List<Integer> postOrderUseDeque(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Deque<Node> stack = new ArrayDeque<>();
        Deque<Node> deque = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            deque.push(root);
            if (!CollectionUtils.isEmpty(root.children)) {
                for (Node node : root.children) {
                    stack.push(node);
                }
            }
        }
        for (Node node : deque) {
            result.add(node.val);
        }
        return result;
    }
}
