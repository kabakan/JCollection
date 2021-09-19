package com.ocp_8.Assesment.test06;

/**
 * Created by Kanat KB on 03.07.2017.
 * A. None, the immutable object pattern is properly implemented.
 * B. Mark name and ducklings final.
 * C. Mark the Duck class final.
 * F. An exception is thrown.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Duck {
    private String name;
    private List<Duck> ducklings;

    public Duck(String name, List<Duck> ducklings) {
        this.name = name;
        this.ducklings = new ArrayList<Duck>(ducklings);
    }

    public String getName() {
        return name;
    }

    public List<Duck> getDucklings() {
        return ducklings;
    }

    public String hasDucklings(Predicate<Duck> p) {
        return p.test(this) ? "Quack Quack" : "";
    }
}

class Test {
    public static void main(String[] args) {
        List<Duck> dlist = new ArrayList<Duck>();
        dlist.add(null);
        System.out.println("#1");
        Duck duck = new Duck("SS", dlist);
        System.out.println("#2 =" + duck.hasDucklings((p) -> true));
    }
}