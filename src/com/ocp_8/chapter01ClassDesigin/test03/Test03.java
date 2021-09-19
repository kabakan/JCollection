package com.ocp_8.chapter01ClassDesigin.test03;

/**
 * Created by Kanat KB on 22.07.2017.
 * C. s1.equals(s2)
 */
public class Test03 {
    public static void main(String[] args) {
        String s1 = "Canada";
        String s2 = new String(s1);
        if(s1 == s2) System.out.println("s1 == s2");
        if(s1.equals(s2)) System.out.println("s1.equals(s2)");
    }
}
