package com.ocp_8.chapter05Localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Kanat KB on 03.10.2017.
 * <p>
 * 4. Assume that all bundles mentioned in the answers exist and define the same keys. Which
 * one will be used to find the key in line 8?
 * <p>
 * 4. B. Java will first look for the most specific matches it can find, starting with Dolphins_en_
 * US.java and then Dolphins_en_US.properties. Since neither is found, it drops the country
 * and looks for Dolphins_en.java. Since a match is found, there is no reason to go on to
 * the next one, which is Dolphins_en.properties.
 * <p>
 * A. Dolphins.properties
 * B. Dolphins_en.java  ***
 * C. Dolphins_en.properties
 * D. Whales.properties
 * E. Whales_en_US.properties
 * F. The code does not compile.
 */
public class Test04 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle b = ResourceBundle.getBundle("Dolphins");
        b.getString("name");
    }
}
