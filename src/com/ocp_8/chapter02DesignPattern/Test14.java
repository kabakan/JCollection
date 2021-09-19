package com.ocp_8.chapter02DesignPattern;

/**
 * Created by Kanat KB on 29.08.2017.
 * <p>
 * 14. Which of the following statements can be inserted in the blank line so that the code will
 * compile successfully? (Choose all that apply.)
 * <p>
 * 14. A, B, D, E. The blank can be filled with any class or interface that is a supertype of TurtleFrog.
 * A is a superclass of TurtleFrog, and B is the same class, so both are correct.
 * BrazilianHornedFrog is not a superclass of TurtleFrog, so C is incorrect. TurtleFrog
 * inherits the CanHop interface, so D is correct. All classes inherit Object, so E is correct.
 * Finally, Long is an unrelated class that is not a superclass of TurtleFrog, and it is therefore
 * incorrect.
 * <p>
 * A. Frog   ***
 * B. TurtleFrog ***
 * C. BrazilianHornedFrog
 * D. CanHop  ***
 * E. Object  ***
 * F. Long
 */
public class Test14 {
}
interface CanHop {
}

class Frog implements CanHop {
    public static void main(String[] args) {
        TurtleFrog frog = new TurtleFrog();
    }
}

class BrazilianHornedFrog extends Frog {
}

class TurtleFrog extends Frog {
}