package com.example.lamda.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by Kanat KB on 12.09.2017.
 */
public class FunctionDemo {
    public static void getFunctionString() {
        System.out.println("------getFunctionString-------");
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5
    }

    public static void getBiFunctionString() {
        System.out.println("------getBiFunctionString-------");
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby-", "chick")); // baby chick
        System.out.println(b2.apply("baby+", "chick")); // baby chick
    }


    public static void main(String[] args) {
        getFunctionString();
        getBiFunctionString();
    }
}
