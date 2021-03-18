package com.example.collection.splitertator;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * Created by Kanat KB on 11.09.2017.
 */
public class SpliteratorDemo {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        vals.add(9.0);
        System.out.println("Содержимое списочного ммассива vals:\n");
        Spliterator<Double> splitr = vals.spliterator();
        while (splitr.tryAdvance((n) -> System.out.println("tryAdvance =" + n))) ;
        System.out.println();

        //Создать новый списочный массив с квадратными корнями
        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n)))) ;
        System.out.println("Содержимое списочного ммассива sqrs:\n");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.println("forEach =" + n));
        System.out.println();
    }
}
