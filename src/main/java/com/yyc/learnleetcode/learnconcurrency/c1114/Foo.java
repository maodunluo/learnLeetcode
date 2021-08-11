package com.yyc.learnleetcode.learnconcurrency.c1114;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 1114. Print in Order
 *
 * @author yuechao
 */
public class Foo {

  private final AtomicInteger firstJobDone = new AtomicInteger();
  private final AtomicInteger secondJobDone = new AtomicInteger();

  public Foo() {

  }

  public void first(Runnable printFirst) throws InterruptedException {

    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    // mark the first job as done, by increasing its count.
    firstJobDone.incrementAndGet();
  }

  public void second(Runnable printSecond) throws InterruptedException {
    while (firstJobDone.get() != 1) {
      // waiting for the first job to be done.
    }

    // printSecond.run() outputs "second". Do not change or remove this line.
    printSecond.run();
    // mark the second as done, by increasing its count.
    secondJobDone.incrementAndGet();

  }

  public void third(Runnable printThird) throws InterruptedException {
    while (secondJobDone.get() != 1) {
      // waiting for the second job to be done.
    }

    // printThird.run() outputs "third". Do not change or remove this line.
    printThird.run();

  }

}
