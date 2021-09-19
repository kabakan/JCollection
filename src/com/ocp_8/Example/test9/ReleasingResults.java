package com.ocp_8.Example.test9;

import java.util.*;
import java.util.function.Predicate;


public class ReleasingResults {
    public static void checkScore(List<String> list, Predicate<String> p){
        for (String e : list) {
            if (p.test(e)) {
                System.out.println(e + ", ");
            }
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alice1",
                "Alice2",
                "Alice3",
                "Alice4");
        System.out.print("Passed: ");
        checkScore(list, e -> e.equals("Alice3"));
        checkScore(list, (String e) -> {return e.equals("Alice3"); });
        //  line r1

    }
}
