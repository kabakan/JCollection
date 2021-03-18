package com.example.lamda.stream;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 */
public class SortedDemo {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown bear-", "grizzly-");
        s.sorted(Comparator.reverseOrder()).forEach(System.out::print); // grizzly-brown bear-
    }
}
