package com.example.all;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SearchFunction {
    private static MapDemo mapDemo = new MapDemo();

    public static void main(String[] args) {
        mapDemo.free = new HashMap<>();
        mapDemo.free.put(1,205.0);
        mapDemo.free.put(2,305.0);
        mapDemo.free.put(3,405.0);
        mapDemo.free.put(4,505.0);
        mapDemo.free.put(5,605.0);

        Double minValue = Collections.min(mapDemo.free.entrySet(), Map.Entry.comparingByValue()).getValue();
        Double maxValue = Collections.max(mapDemo.free.entrySet(), Map.Entry.comparingByValue()).getValue();
        Double countValue = mapDemo.free.values().stream().mapToDouble(i -> i).sum();
        Double avgValue = getAVG(mapDemo.free);

        System.out.println("min value: "+minValue);
        System.out.println("max value: "+maxValue);
        System.out.println("avg value: "+avgValue);
        System.out.println("sum value: "+countValue);
    }

    public static Double getAVG(HashMap<Integer, Double> distance) {
        double sum = 0;
        int count = 0;
        Iterator<Integer> it = distance.keySet().iterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x % 2 == 0) {
                sum = (double) (sum + distance.get(x));
                count++;
            }
        }
        double d = sum / count;
        return d;
    }
}

class MapDemo {
    public HashMap<Integer, Double> free;
}