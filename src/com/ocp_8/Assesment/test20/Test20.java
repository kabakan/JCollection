package com.ocp_8.Assesment.test20;

import java.time.LocalDate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 22.07.2017.
 * C. There is no output.
 */
public class Test20 {
    public static void main(String[] args) {
        Stream<LocalDate> s = Stream.of(LocalDate.now());
        UnaryOperator<LocalDate> u = l -> l;
        s.filter(l -> l != null).map(u).peek(System.out::println);
    }
}
