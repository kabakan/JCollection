package com.example.all;

import java.sql.SQLException;

/**
 * Created by Kanat KB on 22.07.2017.
 */
public class TestInstanseOf {
    public static void main(String[] args) throws SQLException {
        HeavyAnimal hippo = new Hippo();
        Elephant elephant = new Elephant();
        boolean b1 = hippo instanceof Hippo; // true
        boolean b2 = hippo instanceof HeavyAnimal; // true
        boolean b3 = hippo instanceof Elephant; // false
        boolean b4 = elephant instanceof HeavyAnimal; // false
        //boolean b4 = false;
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);
    }
}

class HeavyAnimal {
}

class Hippo extends HeavyAnimal {
}

class Elephant extends HeavyAnimal {
}