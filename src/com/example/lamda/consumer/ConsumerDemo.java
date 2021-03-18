package com.example.lamda.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by Kanat KB on 12.09.2017.
 */
public class ConsumerDemo {

    public static void getConsumerString() {
        System.out.println("---------getConsumerString-------");
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie");
        c2.accept("Annie");
        c2.accept("Annie2");
    }

    public static void getBiConsumerMap() {
        System.out.println("---------getBiConsumerMap-------");
        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map);
    }

    public static void getBiConsumerMap2() {
        System.out.println("---------getBiConsumerMap2-------");
        Map<String, String> map = new HashMap<>();
        BiConsumer<String, String> b1 = map::put;
        BiConsumer<String, String> b2 = (z1, z2) -> map.put(z1, z2);
        b1.accept("chicken", "Cluck");
        b2.accept("chick", "Tweep");
        System.out.println(map);
    }

    public static void main(String[] args) {
        getConsumerString();
        getBiConsumerMap();
        getBiConsumerMap2();
    }
}
