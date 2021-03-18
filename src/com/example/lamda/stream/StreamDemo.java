package com.example.lamda.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 12.09.2017.
 */
public class StreamDemo {
    public static void main(String[] args) {
        getFindAny();
        getAnyMatch();
        // oddNumbers();
    }

    public static void getFindAny() {
        System.out.println("------ s.findAny()-------");
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimps");
        s.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
    }

    public static void oddNumbers() {
        System.out.println("-------oddNumbers.count()------------");
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        System.out.println(oddNumbers.count());
    }

    public static void getAnyMatch() {
        System.out.println("--------getAnyMatch--------");
        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println("anyMatch: " + list.stream().anyMatch(pred)); // true
        System.out.println("allMatch: " + list.stream().allMatch(pred)); // false
        System.out.println("noneMatch: " + list.stream().noneMatch(pred)); // false
        System.out.println("anyMatch: " + infinite.anyMatch(pred)); // true
    }

    public static void getStream() {
        Stream<String> empty = Stream.empty(); // count = 0
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 2

        System.out.println(empty.count());
        System.out.println(singleElement.count());
        System.out.println(fromArray.count());
    }

    public static void getIterator() {
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream().map((s) -> s + s);
        Stream<String> fromListParallel = list.parallelStream();

        Iterator<String> its = fromListParallel.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
    }
}
