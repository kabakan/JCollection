package com.ocp.chapter03Collections;

import java.io.FileNotFoundException;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 12. Which of these statements can fill in the blank so that the Helper class compiles
 * successfully? (Choose all that apply.)
 * <p>
 * 12. A, B, D. The generic type must be Exception or a subclass of Exception since this is an
 * upper bound. C and E are wrong because Throwable is a superclass of Exception. D uses
 * an odd syntax by explicitly listing the type, but you should be able to recognize it as acceptable.
 * <p>
 * A. Helper.printException(new FileNotFoundException("A"));  ***
 * B. Helper.printException(new Exception("B"));  ***
 * C. Helper.<Throwable>printException(new Exception("C"));
 * D. Helper.<NullPointerException>printException(new NullPointerException ("D"));  ***
 * E. Helper.printException(new Throwable("E"));
 */
class Helper {
    public static <U extends Exception> void printException(U u) {
        System.out.println(u.getMessage());
    }

    public static void main(String[] args) {
        Helper.printException(new FileNotFoundException("A"));
        Helper.printException(new Exception("B"));
        //  Helper.<Throwable>printException(new Exception("C"));
        Helper.<NullPointerException>printException(new NullPointerException("D"));
        //  Helper.printException(new Throwable("E"));
    }
}

public class Test12 {
}
