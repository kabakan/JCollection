package com.ocp_8.chapter03Collections;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 18. Which of the following lines can be inserted to make the code compile? (Choose all that apply.)
 * <p>
 * 18. A, B. C is both a class and a type parameter. This means that within the class D, when we
 * refer to C, it uses the type parameter. All of the choices that mention class C are incorrect
 * because it no longer means the class
 * <p>
 * A. A a1 = new A();  ***
 * B. A a2 = new B();  ***
 * C. A a3 = new C();
 * D. C c1 = new A();
 * E. C c2 = new B();
 * F. C c1 = new C();
 */
public class Test18 {
}

class A {
}

class B extends A {
}

class C extends B {
}

class D<C> {
    // INSERT CODE HERE
    A a1 = new A();
    A a2 = new B();
    //  A a3 = new C();
    //  C c1 = new A();
    //  C c2 = new B();
    // C c3 = new C();
}