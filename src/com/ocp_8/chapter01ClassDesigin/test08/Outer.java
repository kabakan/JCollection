package com.ocp_8.chapter01ClassDesigin.test08;

/**
 * Created by Kanat KB on 22.07.2017.
 * C. Line 4 generates a compiler error.
 */
public class Outer {
    private int x = 5;
    protected class Inner {
       // public static int x = 10; // l4
        public void go() { System.out.println(x); }
    }
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.go();
    }
}
