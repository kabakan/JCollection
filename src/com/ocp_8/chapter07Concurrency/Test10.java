package com.ocp_8.chapter07Concurrency;

import java.util.Arrays;

/**
 * Created by Kanat KB on 12.10.2017.
 * 10. What statements about the following code are true? (Choose all that apply.)
 * <p>
 * A. It compiles and runs without issue, outputting the total length of all strings in the
 * stream.
 * B. The code will not compile because of line q1.
 * C. The code will not compile because of line q2. ***
 * D. The code will not compile because of line q3.
 * E. It compiles but throws an exception at runtime.
 */
public class Test10 {
    public static void main(String[] args) {
        System.out.println(Arrays.asList("duck", "chicken", "flamingo", "pelican")
                .parallelStream().parallel() // q1
                .reduce(0,
                        //(c1, c2) -> c1.length() + c2.length(), // q2
                        (c1, c2) -> c1 + c2.length(), // q2
                        (s1, s2) -> s1 + s2)); // q3
    }
}
