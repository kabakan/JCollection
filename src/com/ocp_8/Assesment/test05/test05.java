package com.ocp_8.Assesment.test05;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Kanat KB on 03.07.2017.
 * F. It compiles but throws an exception at runtime on line c2.
 */
public class test05 {
    public static void main(String[] args) {
        List<Integer> source = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> fish = new CopyOnWriteArrayList<>(source);
        List<Integer> mammals = Collections.synchronizedList(source);
        Set<Integer> birds = new ConcurrentSkipListSet<>();
        birds.addAll(source);
        synchronized (new Integer(10)) {
            for (Integer f : fish) fish.add(4); // c1
            for (Integer m : mammals) mammals.add(4); // c2
            for (Integer b : birds) birds.add(5); // c3
            System.out.println(fish.size() + " " + mammals.size() + " " + birds.size());
        }
    }
}
