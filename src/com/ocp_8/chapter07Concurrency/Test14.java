package com.ocp_8.chapter07Concurrency;

import java.util.concurrent.*;

/**
 * Created by Kanat KB on 12.10.2017.
 * 14. What is the result of calling the following method?
 * <p>
 * A. It outputs 20 85.  ***
 * B. It outputs 103 85.
 * C. It outputs 20 103.
 * D. The code will not compile.
 * E. It compiles but throws an exception at runtime.
 * F. The output cannot be determined ahead of time.
 */
public class Test14 {
    public static void addAndPrintItems(BlockingDeque<Integer> deque) throws InterruptedException {
        deque.offer(103);
        deque.offerFirst(20, 1, TimeUnit.SECONDS);
        deque.offerLast(85, 7, TimeUnit.HOURS);
        System.out.print(deque.pollFirst(200, TimeUnit.NANOSECONDS));
        System.out.print(" " + deque.pollLast(1, TimeUnit.MINUTES));
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
        addAndPrintItems(blockingDeque);
    }
}
