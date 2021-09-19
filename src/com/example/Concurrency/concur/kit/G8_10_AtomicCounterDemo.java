package com.example.Concurrency.concur.kit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// 100 threads increment the counter 1_000_000 times each.
// Final counter value must be 100_000_000 but it isn't.
// How to fix this issue?

public class G8_10_AtomicCounterDemo {

    final int ITERATIONS = 1_000_000;
//    int counter = 0;
//---- Solution:
    AtomicInteger counter = new AtomicInteger(0);

    class TestThreads implements Runnable {

        String threadName;

        public TestThreads(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 0; i < ITERATIONS; i++) {
//                counter++;
                counter.getAndIncrement();   // to be used for Solution
            }
        }
    }

    public void test() {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            threads.add(new Thread(new TestThreads("t" + i)));
        }
        System.out.println("Starting threads");
        for (int i = 0; i < 100; i++) {
            threads.get(i).start();
        }
        try {
            for (int i = 0; i < 100; i++) {
                threads.get(i).join();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Count = " + counter);

//        assert counter == ITERATIONS * 100;
        assert (counter.get() == ITERATIONS * 100);  // to be used for Solution
    }

    public static void main(String[] args) {
        new G8_10_AtomicCounterDemo().test();
    }

}
