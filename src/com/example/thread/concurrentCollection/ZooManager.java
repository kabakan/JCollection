package com.example.thread.concurrentCollection;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 09.10.2017.
 */
public class ZooManager {
    private Map<String, Object> foodData = new HashMap<String, Object>();

    public synchronized void put(String key, String value) {
        foodData.put(key, value);
    }

    public synchronized Object get(String key) {
        return foodData.get(key);
    }

    public static void TestConcurrCollect() {
        System.out.println("----------ConcurrentHashMap<>()--------");
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("zebra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant"));

        System.out.println("-------ConcurrentLinkedQueue<>()------");
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(31);
        System.out.println("queue.peek(): " + queue.peek());
        System.out.println("queue.poll(): " + queue.poll());

        System.out.println("--------ConcurrentLinkedDeque<>()---------");
        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(10);
        deque.push(4);
        System.out.println("deque.peek(): " + deque.peek());
        System.out.println("deque.pop(): " + deque.pop());
    }

    public static void BlockingQueue() {
        try {
            System.out.println("---------BlockingQueue()---------");
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();
            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2, TimeUnit.MINUTES);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);
            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
        } catch (InterruptedException e) {
            System.out.println("Err Queue: " + e.getMessage());
        }
    }

    public static void CopyOnWrite() {
        System.out.println("-----CopyOnWrite()----");
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
        for (Integer item : list) {
            System.out.print(item + " ");
            list.add(9);
        }
        System.out.println();
        System.out.println("Size: " + list.size());
    }

    public static void SynchronizedCollections() {
        try {
            System.out.println("------SynchronizedCollections()-------");
            List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4, 3, 52)));
            synchronized (list) {
                for (int data : list)
                    System.out.println(data + " ");
            }

            System.out.println("------earlier example:----");
            Map<String, Object> foodData = new HashMap<String, Object>();
            foodData.put("penguin", 1);
            foodData.put("flamingo", 2);
            Map<String, Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
            for (String key : synchronizedFoodData.keySet())
                // synchronizedFoodData.remove(key);
                System.out.println(key + " ");
        } catch (Exception ex) {
            System.out.println("Err Synchronized: " + ex.getMessage());
        }
    }

    public static void TestParallel() {
        System.out.println("-----TestParallel()-----");
        Stream<Integer> stream = Arrays.asList(1, 2, 3, 4, 5, 6).stream();
        Stream<Integer> parallelStream = stream.parallel();
        System.out.println(parallelStream.toString());

        System.out.println("-----stream()-----");
        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .forEach(s -> System.out.println(s + " "));

        System.out.println("-----parallelStream()-----");
        Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .forEach(s -> System.out.println(s + " "));
    }

    public static void main(String[] args) {
         TestConcurrCollect();
        //  BlockingQueue();
        //  CopyOnWrite();
          SynchronizedCollections();
        TestParallel();
    }
}
