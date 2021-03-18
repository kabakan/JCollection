package com.ocp.chapter07Concurrency;

import java.util.concurrent.*;

/**
 * Created by Kanat KB on 12.10.2017.
 * 12. What is the result of executing the following application? (Choose all that apply.)
 * <p>
 * A. It compiles and runs without issue.
 * B. The code will not compile because of m1.
 * C. The code will not compile because of m2.
 * D. The code will not compile because of m3.
 * E. It compiles but throws an exception at runtime. ***
 * F. It compiles but hangs at runtime.
 */
public class Test12 {
}

class CountNumbers extends RecursiveAction {
    private int start;
    private int end;

    public CountNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    protected void compute() {
        if (start < 0) return;
        else {
            int middle = start + ((end - start) / 2);
            invokeAll(new CountNumbers(start, middle),
                    new CountNumbers(middle, end)); // m1
        }
    }

    public static void main(String[] args) {
        ForkJoinTask<?> task = new CountNumbers(0, 4); // m2
        ForkJoinPool pool = new ForkJoinPool();
        Object result = pool.invoke(task); // m3
    }
}