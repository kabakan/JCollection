package com.example.properties;

import java.util.Properties;

public class DemoProperties {
    public static void main(String[] arg) {
        Properties prop = new Properties();
        prop.put("d1","s1");
        prop.put("d2","s2");
        prop.put("d3","s3");
        prop.put("d4","s4");

        String result = "";
        for (Object key : prop.keySet()) {
            result =result+key+":"+prop.getProperty(key.toString())+";";
        }
        System.out.println(result);
    }
}
