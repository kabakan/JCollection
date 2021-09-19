package com.ocp_8.chapter04Functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Kanat KB on 02.10.2017.
 * <p>
 * 7. We have a method that returns a sorted list without changing the original. Which of the
 * following can replace the method implementation to do the same with streams?
 * <p>
 * 7. F. The sorted() method is used in a stream pipeline to return a sorted Stream. A collector
 * is needed to turn the stream back into a List. The collect() method takes the desired
 * collector.
 * <p>
 * A. return list.stream()
 * .compare((a, b) -> b.compareTo(a))
 * .collect(Collectors.toList());
 * B. return list.stream()
 * .compare((a, b) -> b.compareTo(a))
 * .sort();
 * C. return list.stream()
 * .compareTo((a, b) -> b.compareTo(a))
 * .collect(Collectors.toList());
 * D. return list.stream()
 * .compareTo((a, b) -> b.compareTo(a))
 * .sort();
 * E. return list.stream()
 * .sorted((a, b) -> b.compareTo(a))
 * .collect();
 * F. return list.stream()               ***
 * .sorted((a, b) -> b.compareTo(a))
 * .collect(Collectors.toList());
 */
public class Test07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> in = new ArrayList<>();
        in.add("s1");
        in.add("s2");
        in.add("s3");
        System.out.println("sort: " + sort(in));
        System.out.println("lamdaSort: " + lamdaSort(in));
    }

    private static List<String> sort(List<String> list) {
        List<String> copy = new ArrayList<>(list);
        Collections.sort(copy, (a, b) -> b.compareTo(a));
        return copy;
    }

    private static List<String> lamdaSort(List<String> list) {
        //return list.stream().collect(Collectors.toList());
        return list.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());
    }
}
