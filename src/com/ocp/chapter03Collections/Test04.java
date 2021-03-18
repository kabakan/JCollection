package com.ocp.chapter03Collections;

import java.util.ArrayDeque;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 4. What is the result of the following statements?
 * <p>
 * 4. E. Since we call push() rather than offer(), we are treating the ArrayDeque as a LIFO
 * (last-in, first-out) stack. On line 7, we remove the last element added, which is "ola". On
 * line 8, we look at the new last element ("hi"), but don’t remove it. Lines 9 and 10, we
 * remove each element in turn until none are left. Note that we don’t use an Iterator to loop
 * through the ArrayDeque. The order in which the elements are stored internally is not part
 * of the API contract.
 * <p>
 * A. hello
 * B. hellohi
 * C. hellohiola
 * D. hi
 * E. hihello  ***
 * F. The code does not compile.
 * G. An exception is thrown.
 */
public class Test04 {
    public static void main(String[] args) {
        ArrayDeque<String> greetings = new ArrayDeque<String>();
        greetings.push("hello");
        greetings.push("hi");
        greetings.push("ola");
        greetings.pop();
        greetings.peek();
        while (greetings.peek() != null)
            System.out.print(greetings.pop());
    }
}
