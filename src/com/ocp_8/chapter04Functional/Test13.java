package com.ocp_8.chapter04Functional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Kanat KB on 02.10.2017.
 * 13. Which of the following is true?
 * <p>
 * 13. F. If the map() and flatMap() calls were reversed, choice B would be correct. In this case,
 * the Stream created from the source is of type Stream<List<Integer>>. The Function in
 * map expects an Integer rather than a List<Integer>, so the code does not compile.
 * <p>
 * A. The code compiles and prints 123456.
 * B. The code compiles and prints 234567.
 * C. The code compiles but does not print anything.
 * D. The code compiles but prints stream references.
 * E. The code runs infinitely.
 * F. The code does not compile.   ***
 * G. The code throws an exception
 */
public class Test13 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();

        // Stream.of(l1, l2, l3).map(x -> x+1).flatMap(x -> x.stream()).forEach(System.out::print);
    }
}
