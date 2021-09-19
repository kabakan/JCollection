package com.ocp_8.chapter01ClassDesigin.test05;

/**
 * Created by Kanat KB on 22.07.2017.
 * A. If a.equals(b) is true, a.hashCode() == b.hashCode() is always true.
 */
public class Test05 {
    public static void main(String[] args) {
        String a = "f";
        String b = a;
        boolean d = a.equals(b);
        System.out.println("a="+a.hashCode()+" b="+b.hashCode());
        if ( a.equals(b) ) { System.out.print(d);}

        a = "0";
        b = "1";
        d = a.equals(b);
        System.out.println("a="+a.hashCode()+" b="+b.hashCode());
        if ( a.equals(b) ) { System.out.print(d);}
    }
}
