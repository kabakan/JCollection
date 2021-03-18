package com.example.lamda.unaroperator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * Created by Kanat KB on 12.09.2017.
 */
public class UnarOperatorDemo {
    public static void getUnarOperator() {
        System.out.println("----------getUnaryOperator-----------");
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("chirp"));
        System.out.println(u2.apply("chirp"));
    }

    public static void getBinaryOperator() {
        System.out.println("----------getBinaryOperator-----------");
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }

    public static void main(String[] args) {
        getUnarOperator();
        getBinaryOperator();
    }

}
