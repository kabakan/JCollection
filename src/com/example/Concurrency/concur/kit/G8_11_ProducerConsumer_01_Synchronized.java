package com.example.Concurrency.concur.kit;

import java.util.ArrayList;
import java.util.List;

public class G8_11_ProducerConsumer_01_Synchronized {

    static class FillRemove {

        static List<Integer> list = new ArrayList<>();
        final int LIMIT = 5;
        final Object lock = new Object();
        int val = 0;

        void fill() throws InterruptedException {
            synchronized (lock) {
                while (true) {
                    if (list.size() == LIMIT) {
                        System.out.println("waiting for removal...");
                        lock.wait();
                    } else {
                        System.out.println("Adding " + val);
                        list.add(val++);
                        lock.notify();
                    }
                    Thread.sleep(500);
                }
            }
        }

        void consume() throws InterruptedException {
            synchronized (lock) {
                while (true) {
                    if (list.isEmpty()) {
                        System.out.println("waiting for topping up...");
                        lock.wait();
                    } else {
                        System.out.println("Removing " + list.remove(--val));
                        lock.notify();
                    }
                    Thread.sleep(500);
                }
            }
        }
    }

    public static void main(String[] args) {
        FillRemove inst = new FillRemove();
        Thread t1 = new Thread(() -> {
            try {
                inst.fill();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                inst.consume();
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
