package com.ocp_8.chapter01ClassDesigin.test09;

/**
 * Created by Kanat KB on 22.07.2017.
 * B. x is 24.
 */
public class Outer {
    private int x = 24;

    public int getX() {
        String message = "x is ";
        class Inner {
            private int x = Outer.this.x;

            public void printX() {
                System.out.println(message + x);
            }
        }
        Inner in = new Inner();
        in.printX();
        return x;
    }

    public static void main(String[] args) {
        new Outer().getX();
    }
}
