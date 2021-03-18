package com.ocp.chapter05Localization;

import java.util.Properties;

/**
 * Created by Kanat KB on 03.10.2017.
 * 17. What is the output of the following method if props contains {veggies=brontosaurus,
 * meat=velociraptor}?
 * <p>
 * 17. E. The Properties class defines a get() method that does not allow for a default value.
 * It also has a getProperty() method, which returns the default value if the key is not provided.
 * <p>
 * A. brontosaurus none
 * B. brontosaurus null
 * C. none none
 * D. none null
 * E. The code does not compile.   ***
 * F. A runtime exception is thrown.
 */
public class Test17 {
    private static void print(Properties props) {
      /*  System.out.println(props.get("veggies", "none")
                + " " + props.get("omni", "none")); */
    }
}
