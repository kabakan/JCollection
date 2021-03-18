package com.ocp.chapter01ClassDesigin.test16;

/**
 * Created by Kanat KB on 22.07.2017.
 * E. Outer.Inner in = new Outer().new Inner();
 */
public class Outer {
    class Inner {
    }

    public static void main(String[] args) {
// INSERT CODE HERE
      //  Inner in = new Inner();
      //  Inner in = Outer.new Inner();
      //  Outer.Inner in = new Outer.Inner();
      //  Outer.Inner in = new Outer().Inner();
        Outer.Inner in = new Outer().new Inner();
     //   Outer.Inner in = Outer.new Inner();
    }
}