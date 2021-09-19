package com.ocp_8.Example;

public class DemoInteger {
    public static void main(String[] args) {
        Integer quantity = 4;
        Double Discount = (quantity >= 5) ? 0.5 : (quantity >= 3)? 0.2 : 0;
        System.out.println("Discount = "+Discount);
    }
}
