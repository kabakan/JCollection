package com.ocp_8.Example.test9;

import java.util.*;
import java.util.function.Predicate;

public class TestPredicate {
    String check(List list, Predicate<List> p){                        // line t1
        return p.test(list)? "Empty" : "Populated";
    }
    void run() {
        ArrayList list = new ArrayList();                        // line t2
        System.out.println(
                check(list, myList -> myList.isEmpty()));                 // line t3
    }
    public static void main(String[] args) {
        new TestPredicate().run();
    }
}
