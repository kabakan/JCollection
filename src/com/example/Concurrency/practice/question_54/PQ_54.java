package com.example.Concurrency.practice.question_54;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/*
    Practice Question 54
*/

class Sum extends RecursiveAction {               // line n1
    static final int THRESHOLD = 3;
    int start, end;
    int[] val;
    public Sum(int[] val, int start, int end) {
        this.val = val;
        this.start = start;
        this.end = end;
    }
    protected void compute() {
        int sum = 0;
        if (end - start <= THRESHOLD) {
            for (int i = start; i < end; i++) {
                sum += val[i];
            }
            System.out.println(sum);
        } else {
            new Sum(val, start + THRESHOLD, end).fork();
            new Sum(val, start,
                    Math.min(end, start + THRESHOLD)
            ).compute();
        }
    }
}



public class PQ_54 {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        int val[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        fjp.invoke(new Sum(val, 0, val.length));
    }
}
