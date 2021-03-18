package com.example.collection;

/**
 * Created by Kanat KB on 09.09.2017.
 */

import java.util.*;

public class SortRabbits {
    static class Rabbit {
        int id;
    }

    public static void main(String[] args) {
        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        Comparator<Rabbit> c = (r1, r2) -> r1.id - r2.id;
        Collections.sort(rabbits, c);

        for (Rabbit rab : rabbits) {
            System.out.println(rab.toString() + " " + rab.id);
        }

        List<Integer> list = Arrays.asList(1, 2, 3);
        list.replaceAll(x -> x * 2);
        System.out.println("list update" + list); // [2, 4, 6]

        List<String> cats = Arrays.asList("Annie", "Ripley");
        cats.forEach(System.out::println);

        // BiFunction<String, String, String> mapper = (v1, v2)-> v1.length() > v2.length() ? v1: v2;
    }
}

