package com.example.Concurrency.concur.kit;

import java.util.concurrent.locks.*;

public class G8_12_ProducerConsumer_02_Reentrant_Condition {

    static class Worker {

        Lock lock = new ReentrantLock();
        Condition cond = lock.newCondition();

        void supply() throws InterruptedException {
            lock.lock();
            System.out.println("Supplier: I'm waiting to start supplying...");
            cond.await();
            System.out.println("Supplier: Yep.");
            lock.unlock();  // we REALLY should've used try-catch...
        }

        void consume() throws InterruptedException {
            lock.lock();
            Thread.sleep(2000);
            System.out.println("Consumer: Hey supplier! Go ahead!");
            cond.signal();
            lock.unlock();
            System.out.println("Consumer: Thanks man!");
        }
    }

    public static void main(String[] args) {
        Worker worker = new Worker();

        Thread t1 = new Thread(() -> {
            try {
                worker.supply();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                worker.consume();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
}
