package com.example.local;

import java.util.Locale;

/**
 * Created by Kanat KB on 03.10.2017.
 */
public class LocalDemo {
    public static void main(String[] args) {
        getLocal();
    }

    public static void getLocal() {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println(Locale.GERMAN); // de
        System.out.println(Locale.GERMANY); // de_DE
        System.out.println(new Locale("fr")); // fr
        System.out.println(new Locale("hi", "IN")); // hi_IN
        System.out.println(new Locale("Zz", "ZZ")); // hi_IN
        Locale l1 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        Locale l2 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
        System.out.println(l1);
        System.out.println(l2);
    }
}
