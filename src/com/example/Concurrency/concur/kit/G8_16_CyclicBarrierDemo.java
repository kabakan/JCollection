package com.example.Concurrency.concur.kit;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Runner implements Runnable {

    CyclicBarrier bar1;
    CyclicBarrier bar2;

    public Runner(CyclicBarrier bar1, CyclicBarrier bar2) {
        this.bar1 = bar1;
        this.bar2 = bar2;
    }

    public String getName(){
        return Thread.currentThread().getName();
    }
    
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println(getName() + " arrives at barrier " + 1);
            bar1.await();

            Thread.sleep(2000);
            System.out.println(getName() + " arrives at barrier " + 2);
            bar2.await();

            System.out.println(getName() + " is done!");

        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println(e);
        }
    }
}

public class G8_16_CyclicBarrierDemo {

    public static void main(String[] args) {

        Runnable barAction1 = () ->
                System.out.println("BarrierAction 1 executed\n");
        Runnable barAction2 = () ->
                System.out.println("BarrierAction 2 executed\n");

        CyclicBarrier bar1 = new CyclicBarrier(2, barAction1);
        CyclicBarrier bar2 = new CyclicBarrier(2, barAction2);

        Runner br1 = new Runner(bar1, bar2);
        Runner br2 = new Runner(bar1, bar2);

        Thread th1 = new Thread(br1, "th1");
        Thread th2 = new Thread(br2, "th2");

        th1.start();
        th2.start();
        
        System.out.println("----- Threads started ------");
    }
}
