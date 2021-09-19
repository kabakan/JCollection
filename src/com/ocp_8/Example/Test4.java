package com.ocp_8.Example;


  class A {
     String name;
     A obj;
     A(String name){
                this.name = name;
             }
  }

  class B extends A {
    B(String name) {
               super(name);
            }
 }

public class Test4 {
    public static void main(String[] args) {
                A aa = new A("AA");
                A ab = new B("AB");
                B bb = new B("BB");
               aa.obj = ab;
               ab.obj = bb;
               ab = bb;
                bb = null;
                ab = null;

            }
 }