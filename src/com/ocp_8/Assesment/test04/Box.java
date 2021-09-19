package com.ocp_8.Assesment.test04;

/**
 * Created by Kanat KB on 03.07.2017.
 * E. a string123
 */
public class Box<T> {
    T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box<String> one = new Box<String>("a string");
        Box<Integer> two = new Box<>(123);
        System.out.print(one.getValue());
        System.out.print(two.getValue());
    }
}