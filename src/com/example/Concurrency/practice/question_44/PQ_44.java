package com.example.Concurrency.practice.question_44;

/*
    Practice Question 44
*/

import java.util.concurrent.CyclicBarrier;

class Jerry extends Thread {

    CyclicBarrier cb;

    public Jerry(CyclicBarrier cb) {
        this.cb = cb;
    }

    public void run() {
        try {
            cb.await();
            System.out.println("Jerry running");
        } catch (Exception ex) {
        }
    }
}

//class Master extends Thread {
class Tom implements Runnable { //line n1

    public void run() {
        System.out.println("Tom chasing");
    }
}

public class PQ_44 {

    public static void main(String[] args) {
        Tom tom = new Tom();
        CyclicBarrier cb = new CyclicBarrier(1,tom);
        Jerry jerry = new Jerry(cb);
        jerry.start();
    }
}
