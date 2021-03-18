package com.example.thread.arraydeque;

import java.util.ArrayDeque;

/**
 * Created by Kanat KB on 11.09.2017.
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> adq = new ArrayDeque<String>();
        adq.push("A");
        adq.push("B");
        adq.push("C");
        adq.push("D");
        adq.push("F");

        System.out.println("Извлечение из стека");
        while (adq.peek() != null) {
            System.out.println(adq.pop() + " ");
            System.out.println("que!");
        }
    }
}
