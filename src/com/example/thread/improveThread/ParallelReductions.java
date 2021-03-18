package com.example.thread.improveThread;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 09.10.2017.
 */
public class ParallelReductions {
    public static void TestReduce() {
        System.out.println("--------TestReduce()--------");
        System.out.println(Arrays.asList('w', 'o', 'l', 'f')
                .stream()
                .reduce("", (c, s1) -> c + s1,
                        (s2, s3) -> s2 + s3));
    }


    public static void TestCollect() {
        System.out.println("--------TestCollect()--------");

        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();

        SortedSet<String> set = stream.collect(ConcurrentSkipListSet::new,
                Set::add,
                Set::addAll
        );
        System.out.println(set); // [f, l, o, w]
    }

    public static void TestCollect2() {
        System.out.println("--------TestCollect2()--------");
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set); // [f, w, l, o]
    }

    public static void ParallelReductionCollect() {
        System.out.println("--------ParallelReductionCollect()--------");
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, String> map = ohMy.collect(Collectors.toConcurrentMap(String::length,
                k -> k,
                (s1, s2) -> s1 + "," + s2));
        System.out.println(map); // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // java.util.concurrent.ConcurrentHashMap
    }

    public static void main(String[] args) {
        /*TestReduce();
        TestCollect();
        TestCollect2();*/
        ParallelReductionCollect();
    }
}
