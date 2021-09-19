package com.example.Concurrency.concur.kit;

import java.util.*;
import java.util.concurrent.locks.*;

public class G8_09_ReentrantCalculator {
    
    int res;
    Lock lock = new ReentrantLock();

//    synchronized
    public void add(int val) {
        try {
//            lock.lock();    // alternative to synchronized
            res += val;
        } finally {
//            lock.unlock();
        }
    }

//    synchronized  // also notice that the monitor itself is changing
    public void subtract(int val) {
        try {
//            lock.lock();    // alternative to synchronized
            res -= val;
        } finally {
//            lock.unlock();
        }
    }

     
    public void calc(String... ops) {
        for(String op : ops) {
            switch(op) {
                case "+":      add(1); break;
                case "-": subtract(1); break;
                default: System.out.println("Unknown op: " + op); break;
            }
        }
    }
    
    public static void main(String[] args) {

        G8_09_ReentrantCalculator rc = new G8_09_ReentrantCalculator();

        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                rc.calc("+","+","-","-");
            }
        };
        
        List<Thread> ts = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            ts.add(new Thread(r));
        }
        System.out.println("Starting threads...");
        for (int i = 0; i < ts.size(); i++) {
            ts.get(i).start();
        }
        for (int i = 0; i < ts.size(); i++) {
            try {
                ts.get(i).join();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }

        System.out.println("result: " + rc.res);
    }
}
