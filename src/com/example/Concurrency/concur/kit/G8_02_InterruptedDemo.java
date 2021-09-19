package com.example.Concurrency.concur.kit;

// Demonstrates thread interruption

public class G8_02_InterruptedDemo {

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                int count = 0;
                while (!Thread.interrupted()) {
                    System.out.println(name + ": " + count++);
                }
                System.out.println(name + " has just been interrupted!");
            }
        };

        Thread thdA = new Thread(r, "A");
        Thread thdB = new Thread(r, "B");
        thdA.start();
        thdB.start();

        try {
            Thread.sleep(800);
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        thdA.interrupt();
        thdB.interrupt();
    }
}
