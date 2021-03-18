package com.example.generic;

/**
 * Created by Kanat KB on 01.07.2017.
 */
class Generic<T1, T2> {
    T1 object1;
    T2 object2;

    Generic(T1 one, T2 two) {
        object1 = one;
        object2 = two;
    }

    public T1 getFirst() {
        return object1;
    }

    public T2 getSecond() {
        return object2;
    }

}

class Test {
    public static void main(String[] args) {
        System.out.println("//------------- Generic ------------//");
        Generic<Double, String> pair = new Generic<Double, String>(8.5, " Dodze");
        System.out.println(pair.getFirst() + pair.getSecond());
    }
}