package com.example.Concurrency.concur.kit;

// Both counters must be the same and equal to 20000

public class G8_06_SynchroBlock {

    private final static Object lock = new Object();
    private static int counter1;
    private static int counter2;

    private static void add1() {
        synchronized(lock)
        {
            counter1++;
        }
    }

    private static void add2() {
        synchronized(lock)
        {
            counter2++;
        }
    }

    private static void compute() {
        for (int i = 0; i < 10000; i++) {
            add1();
            add2();
        }
    }

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                compute();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                compute();
            }
        });
        t1.start();
        t2.start();
        try {
            t2.join();
            t1.join();
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.printf("counter1 = %d, counter2 = %d", counter1, counter2 );
        System.out.println();
    }
}
