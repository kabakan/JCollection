package com.example.Concurrency.concur.kit;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Demonstrates how we can obtain results of an execution of a Callable

public class G8_15_CallableDemo {

    static class Worker implements Callable<String> {

        int id = 0;

        public Worker(int id) {
            this.id = id;
        }

        @Override
        public String call() throws Exception {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            return Thread.currentThread().getName() + ", id = " + id;
        }
    }

    public static void main(String[] args) {

        ExecutorService exec = Executors.newFixedThreadPool(2);
        List<Future<String>> list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Future<String> fut = exec.submit(new Worker(i));
            list.add(fut);
        }
        exec.shutdown();

        list.forEach(e -> {
            try {
                System.out.println("List contains: " + e.get());
            } catch (InterruptedException  | ExecutionException ex) {
                System.out.println(ex);
            }
        });
    }
}
