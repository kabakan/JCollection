package com.ocp_8.chapter03Collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 24. Which of the following compiles and print outs the entire set? (Choose all that apply.)
 * <p>
 * 24. F. Choice A is incorrect because forEach takes a Consumer parameter, which requires one
 * parameter. Choices B and C are close. The syntax for a lambda is correct. However, s is
 * already defined as a local variable and therefore the lambda can’t redefine it. Choices D and
 * E use incorrect syntax for a method reference. Choice F is correct.
 * <p>
 * A. () -> System.out.println(s)
 * B. s -> System.out.println(s)
 * C. (s) -> System.out.println(s)
 * D. System.out.println(s)
 * E. System::out::println
 * F. System.out::println  ***
 */
public class Test24 {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();
        s.add("lion");
        s.add("tiger");
        s.add("bear");
        s.forEach(System.out::println);
    }
}
