package com.example.Concurrency.concur.kit;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class G8_13_ExecutorServiceDemo {

    static class Worker implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(
                    Thread.currentThread().getName() + " doing i = " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    System.out.println(ie);
                }
            }
        }
    }

    public static void main(String[] args) {
//        ExecutorService exec = Executors.newFixedThreadPool(5);
//        ExecutorService exec = Executors.newFixedThreadPool(3);
//        ExecutorService exec = Executors.newSingleThreadExecutor();
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new Worker());
        }
        exec.shutdown();
    }
}
