package com.ocp_8.chapter01ClassDesigin.test20;

/**
 * Created by Kanat KB on 22.07.2017.
 * C. walk,toddle,
 */
public class FourLegged {
    String walk = "walk,";

    static class BabyRhino extends FourLegged {
        String walk = "toddle,";
    }

    public static void main(String[] args) {
        FourLegged f = new BabyRhino();
        BabyRhino b = new BabyRhino();
        System.out.println(f.walk);
        System.out.println(b.walk);
    }
}