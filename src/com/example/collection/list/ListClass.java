package com.example.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Kanat KB on 21.08.2017.
 */
public class ListClass {
    public static void getList() {
        List<String> list = new ArrayList<>();
        list.add("s1");
        list.add("s2");
        list.add("s3");
        list.add("s4");
        list.set(1, "s7");
        //list.remove(2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List#1 =" + list.get(i));
        }

        for (String s : list) {
            System.out.println("List#2 =" + list.toString());
        }

        for (String s : list) {
            System.out.println("List#3 =" + list);
        }
    }

    public static void getArray() {
        String[] array = new String[]{"d", "s", "g", "f"};
        String result = "";
        //result.length()
        for (String s : array) {
            result += array;
            System.out.println("result = " + result);
        }


        Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .forEach(s -> System.out.print(s + " "));
    }

    public static void getStream() {
        Stream<Integer> infinite = Stream.iterate(1, x -> x + 1);
        infinite.limit(5)
                .peek(System.out::print)
                .filter(x -> x % 2 == 1)
                .forEach(System.out::print);
    }

    public static void getCharAt() {
        String s = "Chip & Dail";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '&') {
                System.out.println("charAt = " + s.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        //  getList();
        //  getArray();
        //  getStream();
        getCharAt();
    }

}
