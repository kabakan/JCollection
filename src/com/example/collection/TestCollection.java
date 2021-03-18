package com.example.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kanat KB on 05.09.2017.
 */
public class TestCollection {

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source) {
            destiny.add(number);
        }

        for (Object num : destiny) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<? super Integer> myNums3 = new ArrayList<Number>();
        List<? super Float> myNums4 = new ArrayList<Float>();
        List<? super Double> myNums5 = new ArrayList<Double>();

        myNums3.add(12);
        myNums3.add(13);

        List<Double> myDoubles = new ArrayList<>();
        myDoubles.add(100.27);
        myDoubles.add(100.12);
        myDoubles.add(100.35);
        myDoubles.add(100.5);
        //List<Object> myObjs = new ArrayList<Object>();
        List<Number> myObjs = new ArrayList<Number>();

        copy(myDoubles, myObjs);

        System.out.println("finish");
    }
}
