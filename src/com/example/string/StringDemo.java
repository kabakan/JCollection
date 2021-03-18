package com.example.string;

/**
 * Created by Kanat KB on 03.10.2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        //geString();
        //getStringBuilder();

        System.out.println("row1".substring(0,3));

    }

    public static void geString() {
        System.out.println("------getString()------");
        String s = "abcde ";
        System.out.println(s.trim().length()); // 5
        System.out.println(s.charAt(4)); // e
        System.out.println(s.indexOf('e')); // 4
        System.out.println(s.indexOf("de")); // 3
        System.out.println(s.substring(2, 4).toUpperCase()); // CD
        System.out.println(s.replace('a', '1')); // 1bcde
        System.out.println(s.contains("DE")); // false
        System.out.println(s.contains("de")); // false
        System.out.println(s.startsWith("a")); // true
    }

    public static void getStringBuilder() {
        System.out.println("-----getStringBuilder()--------");
        StringBuilder b = new StringBuilder();
        b.append(12345).append('-');
        System.out.println(b.length()); // 6
        System.out.println(b.indexOf("-")); // 5
        System.out.println(b.charAt(2)); // 3

        StringBuilder b2 = b.reverse();
        System.out.println(b.toString()); // -54321
        System.out.println(b == b2); // true

        StringBuilder s = new StringBuilder("abcde");
        s.insert(1, '-').delete(3, 4);
        System.out.println(s); //a-bde
        System.out.println(s.substring(2, 4)); // bd
    }
}
