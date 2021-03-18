package com.example.lamda.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by Kanat KB on 12.09.2017.
 */
public class PredicateDemo {
    public static void getPredicateString() {
        System.out.println("--------getPredicateString--------");
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test("ww"));
        System.out.println(p2.test(""));
    }

    public static void getBiPredicateString() {
        System.out.println("--------getBiPredicateString--------");
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b1.test("chicken", "schick"));
        System.out.println(b2.test("chicken", "chick"));
    }

    public static void main(String[] args) {
        getPredicateString();
        getBiPredicateString();

        System.out.println("-------Test1-------");
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");
        System.out.println(egg.test("egg") + " " + brown.test("br"));
        System.out.println("-------Test2-------");
        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
        System.out.println(brownEggs.test("brown" + " " + otherEggs.test("egg")));
    }
}
