package com.ocp_8.Example;

public class Parent{
    int a;
    int p_summ;
    public Parent(int a) {
        this.a = a;
    }

    public void run() {
        System.out.println("Parent run()");
    }

    void run(int a) {
        System.out.println("Parent run() = "+a);
    }
}
class Child extends Parent{
    int b;
    public Child(int a, int b) {
        super(a);
        // this(a);
        this.b = b;
        p_summ = 100;
    }

    @Override
    public void run() {
        System.out.println("Shild run()");
    }

    @Override
    void run(int a) {
        System.out.println("Child run() = "+a);
    }
    // line X
    Child(int b) { super(Math.PI > Math.E ? 3 : 2); }
    //Child(int c) { this(c = 1, c = 2 ); }
}
