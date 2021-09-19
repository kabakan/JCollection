package com.ocp_8.chapter03Collections;

import java.util.TreeSet;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 8. What is the result of the following code?
 * <p>
 * 8. C. TreeSet sorts the elements. Since uppercase letters sort before lowercase letters, the
 * ordering is "ONE", "One", "one". The ceiling() method returns the smallest element
 * greater than the specified one. "On" appears between "ONE" and "One". Therefore, the
 * smallest element that is larger than the specified value is "One".
 * <p>
 * A. On
 * B. one
 * C. One  ***
 * D. ONE
 * E. The code does not compile.
 * F. An exception is thrown.
 */
public class Test08 {
    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("one");
        tree.add("One");
        tree.add("ONE");
        System.out.println(tree.ceiling("On"));
    }
}
