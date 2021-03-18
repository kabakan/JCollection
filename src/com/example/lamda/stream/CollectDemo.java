package com.example.lamda.stream;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 */
public class CollectDemo {
    /*Example where the logic is different in the accumulator and combiner:*/
    public static void Test1() {
        System.out.println("-------Test1------");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]
    }

    /*If we didn’t need the set to be sorted, we could make the code even shorter:*/
    public static void Test2() {
        System.out.println("-------Test2------");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        Set<String> set = stream.collect(Collectors.toSet());
        System.out.println(set); // [f, w, l, o]
    }

    public static void main(String[] args) {
        Test1();
        Test2();
    }
}
