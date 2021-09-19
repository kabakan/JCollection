package com.example.Concurrency.concur.demo;

public class ThreadCreation {

    public static void main(String[] args) {

        Runnable r = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ", i: " + i);
            }
        };
        
        Thread mt = new Thread(r, "th1");
        mt.start();

        
    }
}
