package com.example.lamda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 */
public class flatMap {
    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        List<String> thre = Arrays.asList("Mama Gorilla", "Kongo Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two, thre);
        animals.flatMap(l -> l.stream()).forEach(System.out::println);
    }
}
