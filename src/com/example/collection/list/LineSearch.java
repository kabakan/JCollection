package com.example.collection.list;

/**
 * Created by Kanat KB on 23.08.2017.
 */
public class LineSearch {
    public static void main(String args[]) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean found = false;

        for (int x : nums) {
            if (x == val) {
                found = true;
                System.out.println("Значение x=" + x);
                break;
            }
        }

        if (found)
            System.out.println("Значение найдено!");
    }
}