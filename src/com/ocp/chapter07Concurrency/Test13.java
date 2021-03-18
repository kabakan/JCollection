package com.ocp.chapter07Concurrency;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 12.10.2017.
 * 13. What statements about the following code snippet are true? (Choose all that apply.)
 * <p>
 * A. It outputs 3 4.    ***
 * B. It outputs 4 3.
 * C. The code will not compile because of line 6.
 * D. The code will not compile because of line 7.
 * E. The code will not compile because of line 8.
 * F. It compiles but throws an exception at runtime.
 * G. The collect() operation is always executed in a single-threaded fashion.
 */
public class Test13 {
    public static void main(String[] args) {
        /*4:*/
        Stream<String> cats = Stream.of("leopard", "lynx", "ocelot", "puma").parallel();
       /* 5:*/
        Stream<String> bears = Stream.of("panda", "grizzly", "polar").parallel();
        /*6:*/
        ConcurrentMap<Boolean, List<String>> data = Stream.of(cats, bears)
        /*7:*/.flatMap(s -> s)
        /*8:*/.collect(Collectors.groupingByConcurrent(s -> !s.startsWith("p")));
        /*9:*/
        System.out.println(data.get(false).size() + " " + data.get(true).size());
    }
}
