package com.example.lamda.stream;

import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 * The peek() method is our fi nal intermediate operation. It is useful for debugging because it
 * allows us to perform a stream operation without actually changing the stream.
 */
public class PeekDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1
    }
}
