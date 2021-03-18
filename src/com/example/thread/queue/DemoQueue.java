package com.example.thread.queue;

import java.util.*;


public class DemoQueue {
   static Comparator<Integer> comparator = new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
            if (o1 > o2) {
                return -1;
            }
            if (o1 < o2) {
                return 1;
            }
            return 0;
        }
    };

    public static void main(String[] args) {
        Queue<Integer> intQueue = new PriorityQueue<>(10, comparator);
        intQueue.add(4);
        intQueue.add(3);
        intQueue.add(1);
        while (!intQueue.isEmpty()) {
            System.out.println(intQueue.remove());
        }

        Queue<String> queue = new PriorityQueue<>();
        queue.add("S1");
        queue.add("S2");
        queue.add("S3");
        queue.forEach(q->{
            System.out.println(queue.peek());
        });
    }
}

