package com.ocp.chapter01ClassDesigin.test06;

/**
 * Created by Kanat KB on 22.07.2017.
 * B. 1
 */
public class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }

    public static void main(String[] args) {
        System.out.println(Flavors.CHOCOLATE.ordinal());
    }
}