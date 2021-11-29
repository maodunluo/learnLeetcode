package com.yyc.learnleetcode.learnalgorithms.a232;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 */
class MyQueue {

  private final Stack<Integer> inputStack;

  private final Stack<Integer> outputStack;

  public MyQueue() {
    inputStack = new Stack<>();
    outputStack = new Stack<>();
  }

  public void push(int x) {
    inputStack.push(x);
  }

  public int pop() {
    if (outputStack.size() != 0) {
      return outputStack.pop();
    }
    while (inputStack.size() != 0) {
      outputStack.push(inputStack.pop());
    }
    return outputStack.pop();
  }

  public int peek() {
    if (outputStack.size() != 0) {
      return outputStack.peek();
    }
    while (inputStack.size() != 0) {
      outputStack.push(inputStack.pop());
    }
    return outputStack.peek();
  }

  public boolean empty() {
    return outputStack.size() == 0 && inputStack.size() == 0;
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */