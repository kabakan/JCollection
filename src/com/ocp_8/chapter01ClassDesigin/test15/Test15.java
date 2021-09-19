package com.ocp_8.chapter01ClassDesigin.test15;

/**
 * Created by Kanat KB on 22.07.2017.
 * A. If equals(null) is called, the method should throw an exception.
 * D. If equals() is passed the wrong type, the method should throw an exception.
 */
public class Test15 {
    public static void main(String[] args) {
        String s = null;
        if (s.equals(null)) System.out.println("null");
        if (s.equals(1)) System.out.println("1");
    }
}
