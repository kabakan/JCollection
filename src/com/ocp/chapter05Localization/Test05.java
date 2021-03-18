package com.ocp.chapter05Localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Kanat KB on 03.10.2017.
 * Suppose that we have the following property files and code. Which bundles are used on
 * lines 8 and 9 respectively?
 * Dolphins.properties
 * name=The Dolphin
 * age=0
 * Dolphins_en.properties
 * name=Dolly
 * age=4
 * Dolphins_fr.properties
 * name=Dolly
 * <p>
 * 5. D. Java will use Dolphins_fr.properties as the matching resource bundle on line 7
 * because it is an exact match on the language of the requested locale. Line 8 finds a matching
 * key in this file. Line 9 does not find a match in that file, and therefore it has to look
 * higher up in the hierarchy. Once a bundle is chosen, only resources in that hierarchy are
 * allowed.
 * <p>
 * A. Dolphins.properties and Dolphins.properties
 * B. Dolphins.properties and Dolphins_en.properties
 * C. Dolphins_en.properties and Dolphins_en.properties
 * D. Dolphins_fr.properties and Dolphins.properties   ***
 * E. Dolphins_fr.properties and Dolphins_en.properties
 * F. The code does not compile.
 */
public class Test05 {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
        ResourceBundle b = ResourceBundle.getBundle("Dolphins", fr);
        b.getString("name");
        b.getString("age");
    }
}
