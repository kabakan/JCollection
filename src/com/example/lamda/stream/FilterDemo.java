package com.example.lamda.stream;

import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 * The filter() method returns a Stream with elements that match a given expression. Here
 * is the method signature:
 */
public class FilterDemo {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("b")).forEach(System.out::print); // monkey
    }
}
