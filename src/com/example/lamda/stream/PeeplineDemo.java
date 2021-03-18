package com.example.lamda.stream;

import java.util.*;

/**
 * Created by Kanat KB on 13.09.2017.
 */
public class PeeplineDemo {
    public static void Test1() {
        System.out.println("-------Test1------");
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex", "Alax");
        List<String> filtered = new ArrayList<>();
        for (String name : list) {
            if (name.length() == 4) filtered.add(name);
        }
        Collections.sort(filtered);
        Iterator<String> iter = filtered.iterator();

        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());

    }

    public static void Test2() {
        System.out.println("-------Test2------");
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2).forEach(System.out::println);


    }

    public static void main(String[] args) {
        Test1();
        Test2();
    }
}
