package com.ocp_8.Example;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("!" + 2 + 3 * 4 + "!");
        int a = 0;
        System.out.println(a + a++ - a-- + " " + a);

        String str = "words";
        System.out.println(str == str.substring(0));
        System.out.println(" str="+str.substring(0));
        System.out.println(str.indexOf(1));
    }
}
