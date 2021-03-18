package com.example.lamda.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 */
public class MapDemo {
    public static void main(String[] args) {
        CollectIntoMap();
        StreamMap();
        CollectGroupMap();
    }

    public static void CollectIntoMap() {
        System.out.println("---------CollectIntoMap----------");
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<String, Integer> map = ohMy.collect(
                Collectors.toMap(s -> s, String::length)
        );
        System.out.println(map); // {lions=5, bears=5, tigers=6}
    }

    public static void StreamMap() {
        System.out.println("-------StreamMap()-------");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo", "kongo");
        s.map(String::length).forEach(System.out::println); // 676
    }

    public static void CollectGroupMap() {
        System.out.println("-------CollectGroupMap()-------");
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }

}
