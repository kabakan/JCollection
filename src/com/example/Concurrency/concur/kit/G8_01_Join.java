package com.example.Concurrency.concur.kit;

// Demonstrates how main() waits on the threads

class Worker extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}

public class G8_01_Join {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Worker(), "Thread_1");
        Thread t2 = new Thread(new Worker(), "Thread_2");
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
        System.out.println("Done!");
    }
}
