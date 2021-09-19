package com.ocp_8.chapter04Functional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 02.10.2017.
 * <p>
 * 16. What is the output of the following?
 * <p>
 * 16. C. The partitioningBy() operation always returns a map with two Boolean keys, even
 * if there are no corresponding values. By contrast, groupingBy() returns only keys that are
 * actually needed.
 * <p>
 * A. {} {}
 * B. {} {false=[], true=[]}
 * C. {false=[], true=[]} {}   ***
 * D. {false=[], true=[]} {false=[], true=[]}
 * E. The code does not compile.
 * F. An exception is thrown.
 */
public class Test16 {
    public static void main(String[] args) {
        Stream<String> s = Stream.empty();

        Stream<String> s2 = Stream.empty();

        Map<Boolean, List<String>> p = s.collect(
                Collectors.partitioningBy(b -> b.startsWith("c")));

        Map<Boolean, List<String>> g = s2.collect(
                Collectors.groupingBy(b -> b.startsWith("c")));

        System.out.println(p + " : " + g + " : ");

    }
}
