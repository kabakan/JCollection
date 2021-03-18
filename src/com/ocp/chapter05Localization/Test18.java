package com.ocp.chapter05Localization;

import java.util.Properties;

/**
 * Created by Kanat KB on 03.10.2017.
 * 18. Which of the following prints out all of the values in props?
 * <p>
 * 18. D. Options E and F do not compile because you can’t get a stream directly from a Properties
 * object. Options A and B do not compile because the method is keySet(), not keys().
 * Option C outputs all of the keys, and Option D outputs all of the values.
 * <p>
 * A. props.keys().stream().map(k -> k .forEach(System.out::println);
 * B. props.keys().stream().map(k -> props.get(k))
 * .forEach(System.out::println);
 * C. props.keySet().stream().map(k -> k) .forEach(System.out::println);
 * D. props.keySet().stream().map(k -> props.get(k))    ***
 * .forEach(System.out::println);
 * E. props.stream().map(k -> k) .forEach(System.out::println);
 * F. props.stream().map(k -> props.get(k)) .forEach(System.out::println);
 */
public class Test18 {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("s1", "a1");
        props.setProperty("s2", "a2");
        props.setProperty("s3", "a3");
        print(props);
    }

    public static void print(Properties props) {
        props.keySet().stream().map(k -> props.get(k)).forEach(System.out::println);
    }
}
