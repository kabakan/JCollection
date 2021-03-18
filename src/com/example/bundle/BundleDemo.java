package com.example.bundle;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Kanat KB on 03.10.2017.
 */
public class BundleDemo extends ListResourceBundle {

    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("resourcebundles.Tax", Locale.US);
        System.out.println(rb.getObject("tax"));

    }

    protected Object[][] getContents() {
        return new Object[][]{{"tax", "SSS"}};
    }
}
