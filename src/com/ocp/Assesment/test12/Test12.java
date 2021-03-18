package com.ocp.Assesment.test12;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Kanat KB on 12.07.2017.
 * D. Dolphins_fr.properties and Dolphins.properties
 */
public class Test12 {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
        b.getString("name");
        b.getString("age");
        System.out.println("Result: " + b.getLocale().toString());
    }
}
