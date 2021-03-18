package com.example.lamda.stream;

import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 * The distinct() method returns a stream with duplicate values removed. The duplicates do
 * not need to be adjacent to be removed. As you might imagine, Java calls equals() to determine
 * whether the objects are the same.
 */
public class DistinctDemo {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");
        s.distinct().forEach(System.out::print); // duckgoose
    }
}
