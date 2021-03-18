package com.example.thread.multithread;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultithreadClient {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService threadPool = Executors.newFixedThreadPool(10);
    Counter counter = new Counter();

    long start = System.nanoTime();

    List<Future<Double>> futures = new ArrayList<>();
    for (int i = 0; i < 100; i++) {
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
        (System.nanoTime() - start) / (1000_000_000),
        value));

    threadPool.shutdown();
  }
}

class Counter {

  public Double count(double a) {
    for (int i = 0; i < 100; i++) {
      a = a + Math.tan(a);
    }

    return a;
  }
}