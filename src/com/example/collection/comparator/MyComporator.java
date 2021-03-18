package com.example.collection.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by Kanat KB on 11.09.2017.
 */
public class MyComporator {
    public static void main(String[] args) {
        System.out.println("------Class-----------");
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("G");
        ts.add("D");
        ts.add("F");
        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();

        System.out.println("------Lyambda-----------");
        TreeSet<String> tsl = new TreeSet<String>((aStr, bStr) -> bStr.compareTo(aStr));
        tsl.add("8");
        tsl.add("2");
        tsl.add("4");
        tsl.add("5");
        tsl.add("5");
        tsl.add("0");
        tsl.add("1");

        for (String element : tsl) {
            System.out.print(element + " ");
        }
    }
}

class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr, bStr;
        aStr = a;
        bStr = b;
        return bStr.compareTo(aStr);
    }
}

