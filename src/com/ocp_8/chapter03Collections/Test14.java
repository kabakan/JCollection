package com.ocp_8.chapter03Collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 14. What is the result of the following program?
 * <p>
 * 14. C. This question is hard because it defines both Comparable and Comparator on the same
 * object. t1 doesn’t specify a Comparator so it uses the Comparable object’s compareTo()
 * method. This sorts by the text instance variable. t2 did specify a Comparator when calling
 * the constructor, so it uses the compare() method, which sorts by the int.
 * <p>
 * A. On line 1, fill in with <>.
 * B. On line 1, fill in with <T>.
 * C. On line 1, fill in with <?>.  ***
 * D. On line 3, fill in with <>.
 * E. On line 3, fill in with <T>.
 * F. On line 3, fill in with <?>.
 */
class Sorted implements Comparable<Sorted>, Comparator<Sorted> {
    private int num;
    private String text;

    Sorted(int n, String t) {
        this.num = n;
        this.text = t;
    }

    public String toString() {
        return "" + num;
    }

    public int compareTo(Sorted s) {
        return text.compareTo(s.text);
    }

    public int compare(Sorted s1, Sorted s2) {
        return 0; /*s1.num – s2.num; */
    }

    public static void main(String[] args) {
        Sorted s1 = new Sorted(88, "a");
        Sorted s2 = new Sorted(55, "b");
        TreeSet<Sorted> t1 = new TreeSet<>();
        t1.add(s1);
        t1.add(s2);
        TreeSet<Sorted> t2 = new TreeSet<>(s1);
        t2.add(s1);
        t2.add(s2);
        System.out.println(t1 + " " + t2);
    }
}

public class Test14 {
}
