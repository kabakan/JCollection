package com.ocp.chapter07Concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Kanat KB on 12.10.2017.
 * 7. What is the result of executing the following code snippet?
 * <p>
 * A. It outputs 3 6 4.  ***
 * B. It outputs 6 6 6.
 * C. It outputs 6 3 4.
 * D. The code does not compile.
 * E. It compiles but throws an exception at runtime on line x1.
 * F. It compiles but throws an exception at runtime on line x2.
 * G. It compiles but enters an infinite loop at runtime.
 */
public class Test07 {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = new CopyOnWriteArrayList<>(l1);
        Set<Integer> s3 = new ConcurrentSkipListSet<>();
        s3.addAll(l1);
        for (Integer item : l2) l2.add(4); // x1
        for (Integer item : s3) s3.add(5); // x2
        System.out.println(l1.size() + " " + l2.size() + " " + s3.size());
    }
}
