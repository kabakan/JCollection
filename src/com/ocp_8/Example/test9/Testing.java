package com.ocp_8.Example.test9;

import java.util.*;

public class Testing {
    public static void main(String[] args) {
            List<Integer> ages = new ArrayList<>();
            ages.add(16);
            ages.add(null);
            for (int i = 0; i < ages.size(); i++) System.out.print(ages.get(i));
            for (int i : ages) System.out.println(i);
    }
}
