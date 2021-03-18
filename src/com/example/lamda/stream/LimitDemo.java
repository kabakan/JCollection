package com.example.lamda.stream;

import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 */
public class LimitDemo {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
        s.skip(4).limit(3).forEach(System.out::print); // 567
    }
}
