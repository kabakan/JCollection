package com.ocp_8.Example.test8;

public class ManyHappyReturns {
    static int run(){
        int a = Math.random() > 0.5 ? 1 : 0;
        try {
            return 1/a ;                            // line X
        }
        catch(ArithmeticException ae){
            return 666;                              // line XX
        }
        finally {
            return 42;                               // line XXX
        }
       // return 123;                                  // line XXXX
    }
    public static void main(String[] args) {
        System.out.println(run());
    }
}