package com.example.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Kanat KB on 11.09.2017.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<String>();
        t.add("B");
        t.add("C");
        t.add("D");
        t.add("A");
        t.add("Q");

        Iterator<String> it = t.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("TreeSet =" + t);
    }
}
