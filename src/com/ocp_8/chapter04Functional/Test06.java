package com.ocp_8.chapter04Functional;

import java.util.stream.Stream;

/**
 * Created by Kanat KB on 02.10.2017.
 * 6. Which of the following can fill in the blank so that the code prints out false? (Choose all
 * that apply.)
 * <p>
 * 6. A. Options C and D are incorrect because these methods do not take a Predicate
 * parameter and do not return a boolean. Options B and E are incorrect because they cause
 * the code to run infinitely. The stream has no way to know that a match won’t show up
 * later. Option A is correct because it is safe to return false as soon as one element passes
 * through the stream that doesn’t match.
 * <p>
 * A. allMatch ***
 * B. anyMatch
 * C. findAny
 * D. findFirst
 * E. noneMatch
 * F. None of the above
 */
public class Test06 {
    public static void main(String[] args) {
        Stream<String> s = Stream.generate(() -> "meow");
        boolean match = s.allMatch(String::isEmpty);
        System.out.println(match);
    }
}
