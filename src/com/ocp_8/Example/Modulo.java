package com.ocp_8.Example;

class Modulo{
    public static void main(String[] args) {
        int a = 10;
        Short s = (short)(int)(long)(float) (a % 4.d);    // line 1
        switch(s) {                                       // line 2
            case 0:
                System.out.println("Divisible by 4");
                break;
            default:
                System.out.println("Not divisible by 4");
                break;
        }

        Short s1 = (short) (a % 4.d);
        Short s2 = (short) 4.d;
        System.out.println(s1+ " " + s2);
    }
}