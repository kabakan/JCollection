package com.example.Concurrency.forkjoin;

// Demonstrates the use of Fork-Join Framework
// by computing the sum of int[] elements

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPool_Simplified {

    static class Sum extends RecursiveTask<Integer> {

        static final int THRESHOLD = 3;
        int start, end;
        int[] val;
        static int result;

        public Sum(int[] val, int start, int end) {
            this.val = val;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            int sum = 0;
            if (end - start <= THRESHOLD) {
                for (int i = start; i < end; i++) {
                    sum += val[i];
                }
                System.out.println(sum);   // printing intermediate sums
                return sum;
            } else {
                RecursiveTask<Integer> otherTask = new Sum(val, start + THRESHOLD, end);
                otherTask.fork();
                return new Sum(val, start, Math.min(end, start + THRESHOLD)).compute()

                        // Uncomment the next LOC to obtain correct result
                         + otherTask.join()

                        ;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ForkJoinPool fjp = new ForkJoinPool();
        int val[] = {11, 12, 13,  // intermediate sum is 36
                     14, 15, 16,  // intermediate sum is 45
                     17, 18, 19,  // intermediate sum is 54
                     20};         // below the threshold
        Sum task = new Sum(val, 0, val.length);
        fjp.invoke(task);
        System.out.println("The final sum is " + task.get());
    }
}
