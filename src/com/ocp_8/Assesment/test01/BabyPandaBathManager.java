package com.ocp_8.Assesment.test01;

/**
 * Created by Kanat KB on 03.07.2017.
 * H. It compiles but waits forever at runtime.
 */

import java.util.concurrent.*;
import java.util.stream.*;

public class BabyPandaBathManager {
    public static void await(CyclicBarrier cb) {
        try {
            cb.await();
            System.out.println("#0");
        } catch (InterruptedException | BrokenBarrierException e) {
            System.out.println("Error #0");
// Handle exception
        }
    }

    public static void main(String[] args) {
        System.out.println("#1");
        final CyclicBarrier cb = new CyclicBarrier(3, () -> System.out.
                println("Clean!"));// u1
        System.out.println("#2");
        ExecutorService service = Executors.newScheduledThreadPool(2);
        IntStream.iterate(1, i -> 1) // u2
                .limit(12)
                .forEach(i -> service.submit( // u3
                        () -> await(cb))); // u4
        service.shutdown();
        System.out.println("#3");
    }
}