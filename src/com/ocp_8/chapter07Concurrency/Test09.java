package com.ocp_8.chapter07Concurrency;

import java.util.concurrent.*;

/**
 * Created by Kanat KB on 12.10.2017.
 * 9. Assuming MyTask is an abstract class that implements the ForkJoinTask interface, what
 * statements about the following code are true? (Choose all that apply.)
 * <p>
 * 9. A, C, E. The code compiles without issue, so F is incorrect. Note that the compute()
 * method is protected in the parent class, although you can override it with public
 * without issue since this is a more accessible modifier. Since compute() returns a value,
 * <p>
 * A. The code correctly finds the minimum value in the array. ***
 * B. MyTask inherits RecursiveAction.
 * C. MyTask inherits RecursiveTask. ***
 * D. The code produces a ForkJoinPool at runtime.
 * E. The class produces single-threaded performance at runtime.  ***
 * F. The code does not compile.
 */
public class Test09 {
}

class MyTask extends RecursiveTask {

    @Override
    protected Object compute() {
        return null;
    }
}
/*
 class FindMin extends MyTask {
    private Integer[] elements;
    private int a;
    private int b;
    public FindMin(Integer[] elements, int a, int b) {
        this.elements = elements;
        this.a = a;
        this.b = b;
    }
     public Integer compute() {
         if ((b-a) < 2)
         return Math.min(elements[a], elements[b]);
         else {
             int m = a + ((b-a) / 2);
             System.out.println(a + "," + m + "," + b);
             MyTask t1 = new FindMin(elements, a, m);
             int result = t1.fork().join();
             return Math.min(new FindMin(elements, m, b).compute(), result);
         }
     }
     public static void main(String[] args) throws InterruptedException,
             ExecutionException {
         Integer[] elements = new Integer[] { 8, -3, 2, -54 };
         MyTask task = new FindMin(elements, 0, elements.length-1);
         ForkJoinPool pool = new ForkJoinPool(1);
         Integer sum = pool.invoke(task);
         System.out.println("Min: " + sum);
     }
 }
*/