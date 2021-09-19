package com.ocp_8.Assesment.test11;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 12.07.2017.
 * B. magic(Stream.empty()); throws an exception.
 * F. magic(Stream.of(5, 10)); throws an exception.
 */
public class Test11 {

    public static void magic(Stream<Integer> s) {
        Optional o = s.filter(x -> x < 7).limit(3).max((x, y) -> x - y);
        System.out.println("Go!");
        System.out.println(o.get());
    }
}

class Test {
    public static void main(String[] args) throws Exception {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(5);
        s.add(6);
        Test11 t = new Test11();
        // t.magic(Stream.empty());
        t.magic(Stream.iterate(1, x -> x++));
        t.magic(Stream.of(5, 10));
    }
}
