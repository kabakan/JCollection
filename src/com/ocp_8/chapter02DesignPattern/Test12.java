package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 29.08.2017.
 * <p>
 * 12. What is the result of the following code?
 * <p>
 * 12. C. The functional interface takes two int parameters. The code on line x1 attempts to use
 * them as if one is an Object, resulting in a compiler error making C the correct answer. It
 * also tries to return String even though the data type for the functional interface method is
 * boolean. It is tricky to use types in a lambda when they are implicitly specified. Remember
 * to check the interface for the real type.
 * <p>
 * A. ok
 * B. too high
 * C. Compiler error on line x1. ***
 * D. Compiler error on line x2.
 * E. Compiler error on a different line.
 * F. A runtime exception is thrown.
 */
public class Test12 {
}

/*
interface Climb {
   boolean isTooHigh(int height, int limit);
}
*/
/*
class Climber {
    public static void main(String[] args) {
        check((h, l) -> h.toString(), 5); // x1
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10)) // x2
            System.out.println("too high");
        else System.out.println("ok");
    }
} */