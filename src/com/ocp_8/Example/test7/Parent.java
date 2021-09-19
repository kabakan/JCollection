package com.ocp_8.Example.test7;

interface I {
    public final static String NAMES = "final";
    public default void walk() {
        System.out.println("interface walk()");
    }
}

public class Parent implements I {
    {
       walk();
    }

    @Override
    public void walk() {
        System.out.println("Parent walk()");
    }

    public String toString() { return "P "; }
    public static void main(String[] args) {
        //new Parent().walk();
        Child c = new Child();
        Parent p = c;
        I inter = p;
        System.out.print(p);
        System.out.print((Child)p);
        System.out.print(inter);
    }
}

class Child extends Parent {
    public String toString() { return "C "; }
}