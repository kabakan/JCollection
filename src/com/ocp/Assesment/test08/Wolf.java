package com.ocp.Assesment.test08;

/**
 * Created by Kanat KB on 12.07.2017.
 * A. Wolf has-a name.
 * B. Wolf has-a Tail.
 * D. Wolf is-a Animal.
 */
public class Wolf extends Canine {
    public Animal animal;

    public void result() {
        Canine c = new Canine();
        System.out.print(c.name);
    }
}
