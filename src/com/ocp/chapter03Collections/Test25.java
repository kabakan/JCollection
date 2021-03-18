package com.ocp.chapter03Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kanat KB on 11.09.2017.
 * <p>
 * 25. What is the result of the following?
 * <p>
 * 25. F. The first call to merge() calls the mapping function and adds the two numbers to get 13.
 * It then updates the map. The second call to merge() sees that the map currently has a null
 * value for that key. It does not call the mapping function but instead replaces it with the new
 * value of 3. Therefore choice F is correct
 * <p>
 * A. {1=10, 2=20}
 * B. {1=10, 2=20, 3=null}
 * C. {1=10, 2=20, 3=3}
 * D. {1=13, 2=20}
 * E. {1=13, 2=20, 3=null}
 * F. {1=13, 2=20, 3=3}  ***
 * G. The code does not compile.
 * H. An exception is thrown.
 */
public class Test25 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, null);
        //    map.put(4, null);
        map.merge(1, 3, (a, b) -> a + b);
        map.merge(3, 3, (a, b) -> a + b);
        System.out.println(map);
    }
}
