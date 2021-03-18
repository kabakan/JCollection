package com.example.lamda.stream;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 13.09.2017.
 * The reduce() method combines a stream into a single object. As you can tell from the
 * name, it is a reduction. The method signatures are these:
 */
public class ReduceDemo {
    public static void Test1() {
        System.out.println("-------Test1------");
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        String word1 = stream1.reduce("", String::concat);
        System.out.println(word1);
    }

    public static void Test2() {
        System.out.println("-------Test2------");
        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println(stream2.reduce(1, (a, b) -> a * b));
    }

    public static void Test3() {
        System.out.println("-------Test3------");
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);

        empty.reduce(op).ifPresent(System.out::print); // no output
        oneElement.reduce(op).ifPresent(System.out::print); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90
    }

    public static void Test4() {
        System.out.println("-------Test4------");
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(1, op, op)); // 90
    }

    public static void main(String[] args) {
        Test1();
        Test2();
        Test3();
        Test4();
    }
}
