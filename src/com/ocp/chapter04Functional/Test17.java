package com.ocp.chapter04Functional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Created by Kanat KB on 02.10.2017.
 * 17. Which of the following is equivalent to this code?
 * <p>
 * 17. E. A UnaryOperator is a special type of function where the parameter and return type
 * are the same. Therefore, option E is correct. Notice that other options don’t even compile
 * because they have the wrong number of generic types for the functional interface provided.
 * <p>
 * A. BiFunction<Integer> f = x -> x*x;
 * B. BiFunction<Integer, Integer> f = x -> x*x;
 * C. BinaryOperator<Integer, Integer> f = x -> x*x;
 * D. Function<Integer> f = x -> x*x;
 * E. Function<Integer, Integer> f = x -> x*x;   ***
 * F. None of the above
 */
public class Test17 {
    public static void main(String[] args) {
        UnaryOperator<Integer> u = x -> x * x;
        System.out.println(u.apply(2));

        Function<Integer, Integer> f = x -> x * x;
        System.out.println(f.apply(2));
    }

}
