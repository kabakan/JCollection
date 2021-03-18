package com.example.exception;

/**
 * Created by Kanat KB on 07.10.2017.
 */
public class AssertDemo {
    public enum Seasons {
        SPRING, SUMMER, FALL, WINTER
    }

    public static void test(Seasons s) {
        switch (s) {
            case SPRING:
            case FALL:
                System.out.println("Shorter hours");
                break;
            case SUMMER:
                System.out.println("Longer hours");
                break;
            default:
                assert false : "Invalid season";
        }
    }

    public static void main(String[] args) {
        Seasons s = null;
        // test(s.SPRING);
        test(s.WINTER);
    }
}
