package com.ocp.chapter04Functional;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 02.10.2017.
 * <p>
 * 14. Which of the following is true?
 * <p>
 * 14. D. Line 4 should obviously look OK. It creates a Stream and uses autoboxing to put the
 * Integer 1 inside. Line 5 converts to a primitive, again using autoboxing. Line 6 converts
 * to a double primitive, which works since double d = 1; would work. Line 7 is where it
 * all falls apart. Converting from a double to an int would require a cast inside the lambda.
 * <p>
 * A. Line 4 does not compile.
 * B. Line 5 does not compile.
 * C. Line 6 does not compile.
 * D. Line 7 does not compile.   ***
 * E. Line 8 does not compile.
 * F. The code throws an exception.
 * G. The code compiles and prints 1.
 */
public class Test14 {
    public static void main(String[] args) {
       /* 4:*/
        Stream<Integer> s = Stream.of(1);
       /* 5:*/
        IntStream is = s.mapToInt(x -> x);
       /* 6:*/
        DoubleStream ds = s.mapToDouble(x -> x);
       /* 7:*/// Stream<Integer> s2 = ds.mapToInt(x -> x);
       /* 8:*/// s2.forEach(System.out::print);
    }
}
