package com.ocp.chapter07Concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Kanat KB on 12.10.2017.
 * 11. What statements about the following code snippet are true? (Choose all that apply.)
 * <p>
 * <p>
 * A. If the code does output anything, the order cannot be determined.
 * B. The code will always output Tortoise followed by Hare.                ***
 * C. The code will always output Hare followed by Tortoise.                ***
 * D. The code does not compile because of line t1.
 * E. The code does not compile because of line t2.
 * F. The code may produce a deadlock at runtime.
 * G. The code may produce a livelock at runtime.
 * H. It compiles but throws an exception at runtime.
 */
public class Test11 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Object o1 = new Object();
        Object o2 = new Object();
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<?> f1 = service.submit(() -> {
            synchronized (o1) {
                synchronized (o2) {
                    System.out.println("Tortoise");
                } // t1
            }
        });
        Future<?> f2 = service.submit(() -> {
            synchronized (o2) {
                synchronized (o1) {
                    System.out.println("Hare");
                } // t2
            }
        });
        f1.get();
        f2.get();
    }
}
