package com.ocp.Assesment.test15;

/**
 * Created by Kanat KB on 22.07.2017.
 * A. CHIPMUNK
 */
public class VisitPark {
    enum AnimalsInPark {
        SQUIRREL, CHIPMUNK, SPARROW;
    }

    public static void main(String[] args) {
        AnimalsInPark[] animals = AnimalsInPark.values();
        System.out.println(animals[1]);
    }
}
