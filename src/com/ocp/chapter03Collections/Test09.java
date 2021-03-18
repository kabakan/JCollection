package com.ocp.chapter03Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 9. Which of the answer choices are valid given the following declaration?
 * <p>
 * 9. E. Trick question! The Map interface uses put() rather than add() to add elements to the
 * map. If these examples used put(), the answer would be A and C. B is no good because a
 * long cannot be shoved into a Double. D is no good because a char is not the same thing as
 * a String.
 * <p>
 * <p>
 * A. map.add("pi", 3.14159);
 * B. map.add("e", 2L);
 * C. map.add("log(1)", new Double(0.0));
 * D. map.add('x', new Double(123.4));
 * E. None of the above  ***
 */
public class Test09 {
    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();
       /* map.add("pi", 3.14159);
        map.add("e", 2L);
        map.add("log(1)", new Double(0.0));
        map.add('x', new Double(123.4)); */
    }
}
