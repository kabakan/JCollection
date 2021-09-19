package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 04.08.2017.
 * <p>
 * 6. What is the result of the following class?
 * <p>
 * 6. A. This code compiles and runs without issue so C, D, E, and F are incorrect. Line h1 creates
 * a lambda expression that checks if the age is less than 5. Since there is only one parameter
 * and it does not specify a type, the parentheses around the type parameter are optional.
 * Line h2 uses the Predicate interface, which declares a test() method. Since test()
 * returns true on the expression, match is output and A is correct.
 * <p>
 * A. match
 * B. not match
 * C. Compiler error on line h1.
 * D. Compiler error on line h2.
 * E. Compile error on line h3.
 * F. A runtime exception is thrown.
 */

import java.util.function.*;

public class Test06 {
    int age;

    public static void main(String[] args) {
        Test06 p1 = new Test06();
        p1.age = 1;
        check(p1, p -> p.age < 5); // h1
    }

    private static void check(Test06 panda, Predicate<Test06> pred) { // h2
        String result = pred.test(panda) ? "match" : "not match"; // h3
        System.out.print(result);
    }
}
