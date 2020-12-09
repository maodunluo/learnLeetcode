package com.yyc.learnleetcode.learnalgorithms.a589;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author yuechao
 */
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        result.add(root.val);
        if(root.children != null) {
            for(Node node : root.children) {
                result.addAll(preorder(node));
            }
        }
        return result;
    }

    public List<Integer> preorderUseStack(Node root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(node.val);
            Deque<Node> childStack = new ArrayDeque<>();
            if (node.children != null) {
                for (Node child: node.children) {
                    childStack.push(child);
                }
            }
            int size = childStack.size();
            for (int i = 0; i < size; i++){
                stack.push(childStack.pop());
            }
        }
        return result;
    }
}
