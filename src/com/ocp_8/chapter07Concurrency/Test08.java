package com.ocp_8.chapter07Concurrency;

import java.util.Arrays;

/**
 * Created by Kanat KB on 12.10.2017.
 * 8. What statements about the following code are true? (Choose all that apply.)
 * <p>
 * <p>
 * A. It outputs 1 6. ***
 * B. It outputs 1 10.
 * C. The code will not compile because of line y1.
 * D. The code will not compile because of line y2.
 * E. The code will not compile because of line y3.
 * F. It compiles but throws an exception at runtime.
 * G. The output cannot be determined ahead of time.
 * H. It compiles but waits forever at runtime.
 */
public class Test08 {
    public static void main(String[] args) {
        Integer i1 = Arrays.asList(1, 2, 3, 4, 5).stream().findAny().get();
        synchronized (i1) { // y1
            Integer i2 = Arrays.asList(6, 7, 8, 9, 10)
                    .parallelStream()
                    .sorted() // y2
                    .findAny().get(); // y3
            System.out.println(i1 + " " + i2);
        }
    }
}
