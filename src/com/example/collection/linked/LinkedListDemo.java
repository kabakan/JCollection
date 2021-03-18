package com.example.collection.linked;

import java.util.LinkedList;

/**
 * Created by Kanat KB on 11.09.2017.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        try {
            LinkedList<String> ll = new LinkedList<String>();
            ll.add("S1");
            ll.add("D2");
            ll.add("F3");
            ll.add("H4");
            ll.add("V6");
            ll.addLast("D78");
            ll.addFirst("D79");
            System.out.println("linkedList = " + ll);

            ll.remove("H4");
            ll.removeFirst();
            ll.removeLast();
            ll.set(3, "KK");
            System.out.println("before remove = " + ll);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }

    }
}
