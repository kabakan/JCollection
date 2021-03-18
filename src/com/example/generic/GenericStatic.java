package com.example.generic;

/**
 * Created by Kanat KB on 31.08.2017.
 */
public class GenericStatic {
    public static <T> void doSth(T t) {
        System.out.println(t.getClass().getName());
    }
}

class Test1 {
    public static void main(String[] args) {
        GenericStatic gs = new GenericStatic();
    }
}