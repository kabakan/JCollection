package com.ocp_8.chapter01ClassDesigin.test07;

/**
 * Created by Kanat KB on 22.07.2017.
 * E. The code does not compile.
 */
public class IceCream {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY
    }
    public static void main(String[] args) {
        Flavors f = Flavors.STRAWBERRY;
       /* switch (f) {
            case 0: System.out.println("vanilla");
            case 1: System.out.println("chocolate");
            case 2: System.out.println("strawberry");
                break;
            default: System.out.println("missing flavor");
        } */
    }
}