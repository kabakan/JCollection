package com.example.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Kanat KB on 23.08.2017.
 */
public class MapSearch {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("n1", "s1");
        map.put("n2", "s2");
        map.put("n3", "s3");
        map.put("n4", "s4");
        map.put("n5", "s5");
        String s = map.get("n3");

        System.out.println("--------Map--------"+s);

        for (String key : map.keySet()) {
            System.out.println(key + " : " + key.toString() + " : " + key.toString());
            if (key.toString().equals(s)) {
                System.out.println("s=" + s);
            }
        }

        System.out.println("--------Set--------");
        Set<Map.Entry<String, String>> set = map.entrySet();

        for (Map.Entry<String, String> key : set) {
            System.out.println(key.getKey() + " : " + key.getValue() + " =" + key.hashCode());
            if (key.toString().equals(s)) {
                System.out.println("s=" + s);
            }
        }

        System.out.println("--------Iterator--------");
        //Получить ключи
        Set<String> set1 = map.keySet();
        //Получить итератор
        Iterator<String> itr = set1.iterator();

        while (itr.hasNext()) {
            System.out.println("itr =" + itr.next() + " " + itr.hashCode());
        }

    }
}
