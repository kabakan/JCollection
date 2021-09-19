package com.example.Concurrency.forkjoin;

/*
    Computes the sum of a humongous randomly filled array by four approaches:
        1) classic for loop
        2) sequential Stream
        3) parallelized Stream
        4) self-implemented FJ pool
    Also measures performance.
*/

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class ForkJoinSum {

    private static ForkJoinPool fjp = new ForkJoinPool();

    private static Random rand = new Random();
    private static final int MIN = 1;
    private static final int MAX = 140;
    private static final int ARR_SIZE = 100_000_000;

    static class Sum extends RecursiveTask<Long> {

        static final int SEQUENTIAL_THRESHOLD = 5000;

        int low;
        int high;
        int[] array;

        Sum(int[] arr, int lo, int hi) {
            array = arr;
            low = lo;
            high = hi;
        }

        @Override
        protected Long compute() {
            if (high - low <= SEQUENTIAL_THRESHOLD) {
                long sum = 0;
                for (int i = low; i < high; ++i) {
                    sum += array[i];
                }
                return sum;
            } else {
                int mid = low + (high - low) / 2;
                Sum left = new Sum(array, low, mid);
                Sum right = new Sum(array, mid, high);
                left.fork();
                long rightAns = right.compute();
                long leftAns = left.join();
                return leftAns + rightAns;
            }
        }
    }

    @FunctionalInterface
    interface SumCalculator<T> {
        long sumArray(T t);
    }

    static int randInt() {
        return rand.nextInt((MAX - MIN) + 1) + MIN;
    }

    static SumCalculator<int[]> sumArraySeq = arr -> {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    };

    static SumCalculator<int[]> sumArrayStream = arr -> Arrays.stream(arr).sum();
    static SumCalculator<int[]> sumArrayStreamParallel = arr -> Arrays.stream(arr).parallel().sum();
    static SumCalculator<int[]> sumArrayForkJoin = arr -> fjp.invoke(new Sum(arr, 0, arr.length));

    static void benchmark(int[] array, SumCalculator<int[]> func) {
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            func.sumArray(array);
            long end = System.nanoTime();
            long time = end - start;
            System.out.printf("time = %5.1f ms\n", (double)time/1_000_000);
        }
    }

    public static void main(String[] args) {
        int[] array = IntStream.generate(ForkJoinSum::randInt)
                               .limit(ARR_SIZE)
                               .toArray();

        System.out.println("--- Summing all array elements sequentially ---");
        benchmark(array, sumArraySeq);

        System.out.println("\n--- Summing using a sequential Stream's sum() ---");
        benchmark(array, sumArrayStream);
        
        System.out.println("\n--- Summing using a parallel Stream's sum() ---");
        benchmark(array, sumArrayStreamParallel);
        
        System.out.println("\n--- Summing using the ForkJoin algo ---");
        benchmark(array, sumArrayForkJoin);
    }

}
