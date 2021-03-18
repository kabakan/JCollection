package com.example.arrays;

/**
 * Created by Kanat KB on 13.09.2017.
 */
public class ArrayDemo {
    public static void TestString() {
        System.out.println("-----TestString()-----");
        String[] array = new String[]{"w", "o", "l", "f"};
        String result = "";
        for (String s : array) {
            result = result + s;
            System.out.println("s: " + s);
        }
        System.out.println(result);

        System.out.println("----parse------");
        String parse = "Hollywood";
        for (int i = 0; i < parse.length(); i++) {
            System.out.println("parse: " + parse.charAt(i));
        }
    }


    public static void TestDouble() {
        System.out.println("-----TestDouble()-----");
        double[][] m = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                m[i][j] = i * j;
                System.out.println("m[i][j]: " + m[i][j]);
            }
        }

        double[] d = new double[]{0.2, 0.5, 10};
        for (int i = 0; i < d.length; i++) {
            System.out.println("d[i]: " + d[i]);
        }
    }

    public static void TestInt() {
        System.out.println("----TestInt()---");
        int[] x;
        x = new int[]{1, 2, 3, 4};
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[i]: " + x[i]);
        }
    }

    public static void main(String[] args) {
        TestString();
        TestDouble();
        TestInt();
    }
}
