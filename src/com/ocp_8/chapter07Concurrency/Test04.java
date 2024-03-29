package com.ocp_8.chapter07Concurrency;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.IntStream;

/**
 * Created by Kanat KB on 12.10.2017.
 * 4. What statement about the following code is true?
 * <p>
 * A. It outputs 100 100. ***
 * B. It outputs 100 99.
 * C. The output cannot be determined ahead of time.
 * D. The code does not compile.
 * E. It compiles but throws an exception at runtime.
 * F. It compiles but enters an infinite loop at runtime.
 */
public class Test04 {
    public static void main(String[] args) {
        AtomicLong value1 = new AtomicLong(0);
        final long[] value2 = {0};
        IntStream.iterate(1, i -> 1).limit(100).parallel()
                .forEach(i -> value1.incrementAndGet());
        IntStream.iterate(1, i -> 1).limit(100).parallel()
                .forEach(i -> ++value2[0]);
        System.out.println(value1 + " " + value2[0]);
    }
}
