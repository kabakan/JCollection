package com.example.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Kanat KB on 31.08.2017.
 */
public class ListSorted {
    public static void main(String args[]) {
        List<Integer> list = Arrays.asList(9, 7, 5, 3);
        Collections.sort(list); // [3, 5, 7, 9]
        System.out.println(Collections.binarySearch(list, 3)); // 0
        System.out.println(Collections.binarySearch(list, 2)); // -1
    }
}
