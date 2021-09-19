package com.ocp_8.chapter03Collections;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 6. What is the result of the following code?
 * <p>
 * 6. C. Line 7 gives a compiler warning for not using generics but not a compiler error. Line 4
 * compiles fine because toString() is defined on the Object class and is therefore always
 * available to call. Line 6 creates the Hello class with the generic type String. Line 7 creates
 * the Hello class with the generic type Object since no type is specified.
 * <p>
 * A. hi
 * B. hi followed by a runtime exception
 * C. hithere ***
 * D. Compiler error on line 4
 * E. Compiler error on line 6
 * F. Compiler error on line 7
 */
public class Test06 {
}
class Hello<T> {
    T t;

    public Hello(T t) {
        this.t = t;
    }

    public String toString() {
        return t.toString();
    }

    public static void main(String[] args) {
        System.out.print(new Hello<String>("hi"));
        System.out.print(new Hello("there"));
    }
}