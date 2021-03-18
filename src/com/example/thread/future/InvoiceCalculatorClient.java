package com.example.thread.future;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

import static java.lang.String.format;

public class InvoiceCalculatorClient {
    public static void main(String[] args) throws Exception {
        getFuture();
        getFuture2();

        getFuture3();
    }

    public static void getFuture() {
        System.out.println("-------getFuture()--------");
        Callable<Integer> task = ()-> {
            try {
                TimeUnit.SECONDS.sleep(1);
                return 555;
            }
            catch (InterruptedException e) {
                throw new IllegalStateException("task interrupted", e);
            }
        };

        try {
        ExecutorService executor = Executors.newFixedThreadPool(1);
        Future<Integer> future = executor.submit(task);

        System.out.println("future done: " + future.isDone());

        Integer result = future.get();

        System.out.println("future done: " + future.isDone());
        System.out.println("result: " + result);

        } catch (Exception ex) {
            System.out.println("Err Future1"+ex.getMessage());
        }
    }

    public static void getFuture2(){
        try {
            System.out.println("-------getFuture2()--------");
            ExecutorService executor = Executors.newWorkStealingPool();

            List<Callable<String>> callables = Arrays.asList(
                    () -> "task1 100",
                    () -> "task2",
                    () -> "task3",
                    () -> "task4");

            executor.invokeAll(callables)
                    .stream()
                    .map(future -> {
                        try {
                            return future.get();
                        } catch (Exception e) {
                            throw new IllegalStateException(e);
                        }
                    })
                    .forEach(System.out::println);
        } catch (Exception ex) {
            System.out.println("Err Future2: "+ex.getMessage());
        }
    }


    public static void getFuture3() {
        System.out.println("-------getFuture3()--------");
        try {
        ExecutorService threadPool = Executors.newFixedThreadPool(8);
        Counter counter = new Counter();

        long start = System.nanoTime();

        List<Future<Double>> futures = new ArrayList<>();
        for (int i = 0; i < 400; i++) {
            final int j = i;
            futures.add(
                    CompletableFuture.supplyAsync(
                            () -> counter.count(j),
                            threadPool
                    ));
        }

        double value = 0;
        for (Future<Double> future : futures) {
            value += future.get();
        }

        System.out.println(format("Executed by %d s, value : %f",
                (System.nanoTime() - start) / (100_000),
                value));

        threadPool.shutdown();

        } catch (Exception ex) {
            System.out.println("Err Future3: "+ex.getMessage());
        }
    }

    static class Counter {

        public Double count(double a) {
            for (int i = 0; i < 1000000; i++) {
                a = a + Math.tan(a);
            }

            return a;
        }
    }
}
