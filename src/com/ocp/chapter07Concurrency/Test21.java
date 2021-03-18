package com.ocp.chapter07Concurrency;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.*;

/**
 * Created by Kanat KB on 12.10.2017.
 * <p>
 * 21. Assuming an implementation of the performCount() method is provided prior to runtime,
 * which of the following are possible results of executing the following application? (Choose
 * all that apply.)
 * <p>
 * A. It outputs a number 10 times.
 * B. It outputs a Boolean value 10 times.
 * C. It outputs a null value 10 times.
 * D. It outputs Exception! 10 times.
 * E. It hangs indefinitely at runtime.
 * F. It throws an unhandled exception at runtime.
 * G. The code will not compile because of line o1.
 * H. The code will not compile because of line o2.
 */
public class Test21 {
}

class CountZooAnimals {
    public static void performCount(int exhibitNumber) {
// IMPLEMENTATION OMITTED
        System.out.println();
    }

    public static void printResults(Future<?> f) {
        try {
            System.out.println(f.get()); // o1
        } catch (Exception e) {
            System.out.println("Exception!");
        }
    }

    public static void main(String[] args) throws InterruptedException,
            ExecutionException {
        ExecutorService service = Executors.newSingleThreadExecutor();
        final List<Future<?>> results = new ArrayList<>();
        IntStream.range(0, 10)
                .forEach(i -> results.add(
                        service.submit(() -> performCount(i)))); // o2
        results.stream().forEach(f -> printResults(f));
        service.shutdown();
    }
}